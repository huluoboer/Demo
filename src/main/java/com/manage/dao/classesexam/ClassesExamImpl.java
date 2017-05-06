package com.manage.dao.classesexam;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.manage.bean.ClassesExam;
import com.manage.commom.JdbcUtil;
import com.manage.commom.RowMap;

public class ClassesExamImpl implements IClassesExam,RowMap<ClassesExam> {

	
	String sel="SELECT cname,subname,ename ,time ,flag FROM exam ,subject,classes where exam.subid=subject.id and exam.cid=classes.id";
	@Override
	public List<ClassesExam> getAllExams() {
		// TODO Auto-generated method stub
		return JdbcUtil.findAll(sel, this, null);
	}

	@Override
	public ClassesExam rowMapping(ResultSet rs) {
		// TODO Auto-generated method stub
		ClassesExam ce = new  ClassesExam();
		try {
			ce.setCname(rs.getString("cname"));
			ce.setEname(rs.getString("ename"));
			ce.setSubname(rs.getString("subname"));
			ce.setTime(rs.getDate("time"));
			ce.setFlag(rs.getInt("flag"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return ce;
	}

}
