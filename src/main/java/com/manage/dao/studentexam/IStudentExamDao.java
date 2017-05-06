package com.manage.dao.studentexam;

import java.util.List;

import com.manage.bean.StudentExam;

public  interface IStudentExamDao {
	public List<StudentExam> getStudentsExam(String cname,String ename);
}
