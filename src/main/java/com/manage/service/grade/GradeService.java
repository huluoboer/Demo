package com.manage.service.grade;

import java.util.List;

import com.manage.bean.Classes;
import com.manage.bean.Exam;
import com.manage.bean.Grade;
import com.manage.dao.classes.ClassesDaoImpl;
import com.manage.dao.classes.IClassesDao;
import com.manage.dao.exam.ExamDaoImpl;
import com.manage.dao.exam.IExamDao;
import com.manage.dao.grade.GradeDaoImpl;
import com.manage.dao.grade.IGradeDao;

public class GradeService implements IGradeService{

	IGradeDao dao = new GradeDaoImpl();

	@Override
	public List<Grade> getGrades(int cla,int ex) {
		// TODO Auto-generated method stub
		return dao.getGrades(cla,ex);
	}

	@Override
	public int addGrade(Grade grade) {
		// TODO Auto-generated method stub
		return dao.addOneGrades(grade);
	}

}
