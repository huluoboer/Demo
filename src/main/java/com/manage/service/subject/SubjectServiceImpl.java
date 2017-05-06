package com.manage.service.subject;

import java.util.List;

import com.manage.bean.Subject;
import com.manage.dao.subject.ISubjectDao;
import com.manage.dao.subject.SubjectDaoImpl;

public class SubjectServiceImpl implements ISubjectService {

	
	ISubjectDao ds = new SubjectDaoImpl();
	
	
	@Override
	public List<Subject> getSubjects() {
		// TODO Auto-generated method stub
		return ds.getAllSubjects();
	}

	@Override
	public int getSubjectsSid(String name) {
		// TODO Auto-generated method stub
		return ds.getOneSubject(name);
	}

}
