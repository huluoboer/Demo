package com.manage.dao.exam;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.manage.bean.Exam;
import com.manage.commom.JdbcUtil;
import com.manage.commom.RowMap;

public class ExamDaoImpl implements IExamDao ,RowMap<Exam>{

	String sql ="select id, ename,flag,time from exam where subid=?";
	String sql1 ="select id,ename,flag,time from exam";
	
	
	@Override
	public List<Exam> getSubjectExams(int subid) {
		// TODO Auto-generated method stub
		return JdbcUtil.findAll(sql, this, subid);
	}

	@Override
	public List<Exam> getCSExams(int cid, int subid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getExamFlag(String ename) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateExamFlag(int eid ) {
		String sqlll="update exam set flag=1 where id=?";
		// TODO Auto-generated method stub
		return JdbcUtil.updateData(sqlll, eid);
	}

	@Override
	public Exam rowMapping(ResultSet rs) {
		// TODO Auto-generated method stub
		Exam cla = new Exam();
		try {
			cla.setId(rs.getInt("id"));
			cla.setEname(rs.getString("ename"));
			cla.setFlag(rs.getInt("flag"));
			cla.setDate(rs.getDate("time"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cla;
	}

	@Override
	public List<Exam> getAllExams() {
		// TODO Auto-generated method stub
		return JdbcUtil.findAll(sql1,this,null);
	}

	@Override
	public int addExam(Exam ex) {
		// TODO Auto-generated method stub
		String sqladd="insert into exam(ename,cid,subid,time,flag)values(?,?,?,?,?)";
		return JdbcUtil.updateData(sqladd, ex.getEname(),ex.getCid(),ex.getStuid(),ex.getDate(),ex.getFlag());
	}

}
