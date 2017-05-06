package com.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manage.bean.Classes;
import com.manage.bean.ClassesExam;
import com.manage.bean.Exam;
import com.manage.bean.Student;
import com.manage.bean.Subject;
import com.manage.service.classes.ClassesServiceImpl;
import com.manage.service.classes.IClassesService;
import com.manage.service.classexam.ClassExamServiceImpl;
import com.manage.service.classexam.IClassesExamService;
import com.manage.service.exam.ExamServiceImpl;
import com.manage.service.exam.IExamService;
import com.manage.service.student.IStudentService;
import com.manage.service.student.StudnentServiceImpl;
import com.manage.service.subject.ISubjectService;
import com.manage.service.subject.SubjectServiceImpl;
@Controller
public class mainManagerController {
	IClassesExamService  ise=new ClassExamServiceImpl();
	IExamService examService = new ExamServiceImpl();
	ISubjectService subService = new SubjectServiceImpl();

	IClassesService classesService = new ClassesServiceImpl();
	
	IStudentService studentService = new StudnentServiceImpl();
	
	
	@RequestMapping("user.do")
	public String mainUsers(ModelMap map){
		List<Student> allStudent = studentService.getStudents();
		map.addAttribute("list", allStudent );
		System.out.println(allStudent.toString());
		return "main/students";
	}
	
	
	
	
	@RequestMapping("student.do")
	public String mainStudents(ModelMap map){
		List<Student> allStudent = studentService.getStudents();
		map.addAttribute("list", allStudent );
		System.out.println(allStudent.toString());
		return "main/students";
	}
	
	
	
	
	@RequestMapping("classes.do")
	public String mainClasses(ModelMap map){
		List<Classes> allClasses = classesService.getAllClasses();
		map.addAttribute("list", allClasses);
		System.out.println(allClasses.toString());
		return "main/classes";
	}
	
	
	
	@RequestMapping("subject.do")
	public String mainSubject(ModelMap map){
		List<Subject> allSubejcts = subService.getSubjects();
		map.addAttribute("list", allSubejcts);
		System.out.println(allSubejcts.toString());
		return "main/subjects";
	}

	@RequestMapping("exam.do")
	public String mainExam(ModelMap map){
		List<ClassesExam> all = ise.getAll();
		map.addAttribute("list", all);
		System.out.println(all.toString());
		return "main/exam";
	}
	
	@RequestMapping("selectgrade.do")
	public String mainGrade(){
		return "main/test";
	}
}
