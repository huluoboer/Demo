package com.manage.service.grade;

import java.util.List;

import com.manage.bean.Classes;
import com.manage.bean.Exam;
import com.manage.bean.Grade;

public interface IGradeService {
   
	public List<Grade> getGrades(int cid ,int eid);
	public int addGrade(Grade grade);
}
