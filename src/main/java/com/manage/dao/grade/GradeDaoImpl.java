package com.manage.dao.grade;

import java.util.List;

import com.manage.bean.Grade;
import com.manage.commom.JdbcUtil;

public class GradeDaoImpl implements IGradeDao {

	@Override
	public List<Grade> getGrades(int cid,int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateOneGrades(int eid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addOneGrades(Grade grade) {
		String sql ="insert into grade(sno,eid,score)values(?,?,?)";
		// TODO Auto-generated method stub
		return JdbcUtil.updateData(sql, grade.getSid(),grade.getEid(),grade.getScore());
	}

	@Override
	public Grade getOneGrades(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
