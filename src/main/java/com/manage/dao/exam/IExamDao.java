package com.manage.dao.exam;

import java.util.List;

import com.manage.bean.Exam;

public interface IExamDao { 
   
   //是否录入成绩
   public int getExamFlag(String ename);
   
   public int updateExamFlag(int eid);
   
   //获取某个科目的所有考试
   public List<Exam> getSubjectExams(int subid);
   
   
  
   
   //获取某个班级某个科目的所有考试
   public List<Exam> getCSExams(int cid,int subid);

      public List<Exam> getAllExams();

	   public int addExam(Exam ex);

	
}
