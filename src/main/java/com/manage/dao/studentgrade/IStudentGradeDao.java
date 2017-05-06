package com.manage.dao.studentgrade;

import java.util.List;

import com.manage.bean.StudentGrade;

public interface IStudentGradeDao {
	public List<StudentGrade> getStudentsGrade(String cname ,String ename);
	public List<StudentGrade> getOneStudentGrade(int sno);
}
