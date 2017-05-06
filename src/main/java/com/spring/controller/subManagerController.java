package com.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import com.manage.bean.Classes;
import com.manage.bean.Exam;
import com.manage.bean.Subject;
import com.manage.service.classes.ClassesServiceImpl;
import com.manage.service.classes.IClassesService;
import com.manage.service.exam.ExamServiceImpl;
import com.manage.service.exam.IExamService;
import com.manage.service.subject.ISubjectService;
import com.manage.service.subject.SubjectServiceImpl;


@Controller
public class subManagerController {

	IClassesService ics = new ClassesServiceImpl();
	ISubjectService iss = new SubjectServiceImpl();
	IExamService ies = new ExamServiceImpl();
	
	
	
	@RequestMapping("preaddExam.do")
	public String getAddExam(ModelMap mm){
		System.out.println("????????,,,,,,,");
	List<Classes> allClasses = ics.getAllClasses();
	List<Subject> subjects = iss.getSubjects();
	mm.addAttribute("classes", allClasses);
	mm.addAttribute("subjects", subjects);
		return "main/addExam";
		
	}
	@RequestMapping("addExam.do")
	public String addExam(Exam exam){
		System.out.println(exam.toString());
		System.out.println(ies.addExam(exam));
	
	return "redirect:exam.do";
		
	}
	
	
	
	
	
	
}
