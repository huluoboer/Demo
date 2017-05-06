package com.manage.service.student;

import java.util.List;

import com.manage.bean.Student;
import com.manage.dao.student.IStudentDao;
import com.manage.dao.student.StudentDaoImpl;

public class StudnentServiceImpl implements IStudentService {

	
	      IStudentDao iso=new StudentDaoImpl();
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return iso.getAllStudents();
	}

	@Override
	public int addStudent(Student stu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student getOneStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
