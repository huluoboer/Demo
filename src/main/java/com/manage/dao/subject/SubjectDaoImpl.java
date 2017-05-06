package com.manage.dao.subject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.manage.bean.Classes;
import com.manage.bean.Subject;
import com.manage.commom.JdbcUtil;
import com.manage.commom.RowMap;

public class SubjectDaoImpl implements ISubjectDao,RowMap<Subject> {
	String sql="select id, subname from subject";
	String sql1="select id, subname from subject where subname=?";
	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return JdbcUtil.findAll(sql, this, null);
	}

	@Override
	public int getOneSubject(String subname) {
		// TODO Auto-generated method stub
	
		return JdbcUtil.findOne(sql1, this, subname).getId();
	}

	@Override
	public Subject rowMapping(ResultSet rs) {
		// TODO Auto-generated method stub
		Subject cla = new Subject();
		try {
			cla.setId(rs.getInt("id"));
			cla.setSubname(rs.getString("subname"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cla;
	}

}
