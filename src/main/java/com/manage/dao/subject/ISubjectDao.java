package com.manage.dao.subject;

import java.util.List;

import com.manage.bean.Subject;

public interface ISubjectDao {
	
	//获取所有科目
   public List<Subject> getAllSubjects();
   
   
   //获取单个
   
   public int getOneSubject(String name);
   
}
