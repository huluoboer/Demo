package com.manage.service.subject;

import java.util.List;

import com.manage.bean.Subject;

public interface ISubjectService {
	
	
	public List<Subject> getSubjects();
	
	public int getSubjectsSid(String name);
	
}
