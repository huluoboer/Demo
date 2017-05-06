package com.manage.service.exam;

import java.util.List;

import com.manage.bean.Exam;
import com.manage.dao.exam.ExamDaoImpl;
import com.manage.dao.exam.IExamDao;

public class ExamServiceImpl implements IExamService {

	IExamDao ied = new ExamDaoImpl();
	
	@Override
	public List<Exam> getExams(int suid) {
		// TODO Auto-generated method stub
		return ied.getSubjectExams(suid);
	}

	@Override
	public List<Exam> getAllExams() {
		// TODO Auto-generated method stub
		return ied.getAllExams();
	}

	@Override
	public int updateExamFlag(int eid) {
		// TODO Auto-generated method stub
		return ied.updateExamFlag(eid);
	}

	@Override
	public int addExam(Exam ex) {
		// TODO Auto-generated method stub
		return ied.addExam(ex);
	}


}
