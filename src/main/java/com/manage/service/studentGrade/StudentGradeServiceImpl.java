package com.manage.service.studentGrade;

import java.util.List;

import com.manage.bean.StudentGrade;
import com.manage.dao.studentgrade.IStudentGradeDao;
import com.manage.dao.studentgrade.StudentGradeImpl;


public class StudentGradeServiceImpl implements IStudentGradeService {

	
	IStudentGradeDao ss = new StudentGradeImpl();
	@Override
	public List<StudentGrade> getOneStudentGrade(int sid) {
		// TODO Auto-generated method stub
		return ss.getOneStudentGrade(sid);
	}

	@Override
	public List<StudentGrade> getStudentsGrade(String cname, String ename) {
		// TODO Auto-generated method stub
		return ss.getStudentsGrade(cname, ename);
	}

   
	
	

}
