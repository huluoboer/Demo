package com.manage.dao.classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.manage.bean.Classes;
import com.manage.commom.JdbcUtil;
import com.manage.commom.RowMap;

public class ClassesDaoImpl implements IClassesDao,RowMap<Classes> {

	String sql="select id, cname from classes";
	@Override
	public List<Classes> getAllClasses() {
		// TODO Auto-generated method stub
		return JdbcUtil.findAll(sql, this, null);
	}

	@Override
	public int addClass(Class cla) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleClass(Class cla) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateClass(Class cla) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Classes getOneClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classes rowMapping(ResultSet rs) {
		// TODO Auto-generated method stub
		Classes cla = new Classes();
		try {
			cla.setId(rs.getInt("id"));
			cla.setCname(rs.getString("cname"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cla;
	}

}
