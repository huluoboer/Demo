package com.manage.dao.studentexam;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.manage.bean.StudentExam;
import com.manage.bean.StudentGrade;
import com.manage.commom.JdbcUtil;
import com.manage.commom.RowMap;

public class StudentExamDaoImpl implements IStudentExamDao ,RowMap<StudentExam>{

	
	String sql="SELECT sno,sname,ex.id eid,cname,ename from students stu,classes cla,exam ex where stu.cid=cla.id and cla.id=ex.cid  and flag=0 and cname=? and ename=?";
	@Override
	public List<StudentExam> getStudentsExam(String cname,String ename) {
		// TODO Auto-generated method stub
		return JdbcUtil.findAll(sql, this, cname,ename);
	}
	@Override
	public StudentExam rowMapping(ResultSet rs) {
		// TODO Auto-generated method stub
		StudentExam sg = new StudentExam();
		try {
			sg.setSno(rs.getInt("sno"));
			sg.setSname(rs.getString("sname"));
			sg.setEid(rs.getInt("eid"));
			sg.setCname(rs.getString("cname"));
			sg.setEname(rs.getString("ename"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return sg;
	}
	}


