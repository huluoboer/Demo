package com.manage.service.studentExam;

import java.util.List;

import com.manage.bean.StudentExam;

public interface IStudentExamService {
	public List<StudentExam> getStudentsExam(String cname,String ename);
}
