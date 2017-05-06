package com.manage.service.student;

import java.util.List;

import com.manage.bean.Grade;
import com.manage.bean.Student;

public interface IStudentService {
	public List<Student> getStudents();
	public int addStudent(Student stu);
	public Student getOneStudent(int id);
}
