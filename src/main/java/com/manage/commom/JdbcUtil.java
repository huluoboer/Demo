package com.manage.commom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {

	// 常量
	private static final String DRIVEN = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://192.168.237.128:3306/one?characterEncoding=utf8&useSSL=true";
	private static final String USER = "root";
	private static final String PASSWORD = "123456";

	// 加载驱动
	// 获取链接
	public static Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName(DRIVEN);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

	// 关闭资源
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// 写入方法
	public static int updateData(String sql, Object... param) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					ps.setObject(i + 1, param[i]);
				}
			}

			result = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, null, null);
		}

		return result;

	}

	// 查询方法
	public static <T> List<T> findAll(String sql, RowMap<T> rowmap, Object... param) {
		List<T> lists = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (param != null) {
			for (int i = 0; i < param.length; i++) {
				try {
					ps.setObject(i + 1, param[i]);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			rs = ps.executeQuery();
			while(rs.next()){
				lists.add(rowmap.rowMapping(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, null, null);
		}

		return lists;

	}
	// 查询单个Object

	public static <T> T findOne(String sql, RowMap<T> rowmap, Object... param) {
		T t = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (param != null) {
			for (int i = 0; i < param.length; i++) {
				try {
					ps.setObject(i + 1, param[i]);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			rs = ps.executeQuery();
			if (rs.next()){
				t = rowmap.rowMapping(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return t;

	}

}
