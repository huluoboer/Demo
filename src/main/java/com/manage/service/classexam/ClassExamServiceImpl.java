package com.manage.service.classexam;

import java.util.List;

import com.manage.bean.ClassesExam;
import com.manage.dao.classesexam.ClassesExamImpl;
import com.manage.dao.classesexam.IClassesExam;

public class ClassExamServiceImpl implements IClassesExamService {
	IClassesExam ie=new ClassesExamImpl();
	@Override
	public List<ClassesExam> getAll() {
		// TODO Auto-generated method stub
		return ie.getAllExams();
	}

}
