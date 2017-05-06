package com.manage.dao.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.manage.bean.Classes;
import com.manage.bean.Student;
import com.manage.commom.JdbcUtil;
import com.manage.commom.RowMap;

public class StudentDaoImpl implements IStudentDao,RowMap<Student> {

	@Override
	public List<Student> getClassStudents(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent(int sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAllStudents() {
		String sql="select id ,sno,sname,sex ,cid from students";
		// TODO Auto-generated method stub
		return JdbcUtil.findAll(sql,this,null);
	}

	@Override
	public Student rowMapping(ResultSet rs) {
		// TODO Auto-generated method stub
		
		Student cla = new Student();
		try {
			cla.setId(rs.getInt("id"));
			cla.setSno(rs.getString("sno"));
			cla.setSname(rs.getString("sname"));
			cla.setSex(rs.getString("sex"));
			cla.setCid(rs.getInt("cid"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cla;
		
	}

}
