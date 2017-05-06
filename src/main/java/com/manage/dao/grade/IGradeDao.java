package com.manage.dao.grade;

import java.util.List;

import com.manage.bean.Exam;
import com.manage.bean.Grade;

public interface IGradeDao {
	
	//获取某次考试的所有成绩
   public List<Grade> getGrades(int  cid,int eid);
  
   public Grade getOneGrades(int  sid);
    //修改分数
   public int updateOneGrades(int  eid);
   
   
   public int addOneGrades(Grade  grade);
}
