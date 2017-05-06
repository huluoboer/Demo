package com.manage.service.studentGrade;

import java.util.List;

import com.manage.bean.StudentGrade;

public interface IStudentGradeService {
	public List<StudentGrade> getOneStudentGrade(int sid);
	
	public List<StudentGrade> getStudentsGrade(String cname ,String ename);
}
