package com.manage.service.exam;

import java.util.List;

import com.manage.bean.Exam;
import com.manage.bean.Grade;

public interface IExamService {
	
	
	public List<Exam> getExams(int suid);

	public List<Exam> getAllExams();
	
	 public int updateExamFlag(int eid);
	 public int addExam(Exam ex);
}
