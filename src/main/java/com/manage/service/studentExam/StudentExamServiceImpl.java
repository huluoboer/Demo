package com.manage.service.studentExam;

import java.util.List;

import com.manage.bean.StudentExam;
import com.manage.dao.studentexam.IStudentExamDao;
import com.manage.dao.studentexam.StudentExamDaoImpl;



public class StudentExamServiceImpl implements IStudentExamService {

	IStudentExamDao igs=new StudentExamDaoImpl();
	@Override
	public List<StudentExam> getStudentsExam(String cname, String ename) {
		// TODO Auto-generated method stub
		return igs.getStudentsExam(cname, ename);
	}

}
