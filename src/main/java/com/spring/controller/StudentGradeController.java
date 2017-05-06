package com.spring.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.manage.bean.Classes;
import com.manage.bean.Exam;
import com.manage.bean.StudentExam;
import com.manage.bean.StudentGrade;
import com.manage.bean.Subject;
import com.manage.bean.select;
import com.manage.service.classes.ClassesServiceImpl;
import com.manage.service.classes.IClassesService;
import com.manage.service.exam.ExamServiceImpl;
import com.manage.service.exam.IExamService;
import com.manage.service.studentExam.IStudentExamService;
import com.manage.service.studentExam.StudentExamServiceImpl;
import com.manage.service.studentGrade.IStudentGradeService;
import com.manage.service.studentGrade.StudentGradeServiceImpl;
import com.manage.service.subject.ISubjectService;
import com.manage.service.subject.SubjectServiceImpl;


@Controller
public class StudentGradeController {
	IExamService examService = new ExamServiceImpl();
	ISubjectService subjectService = new SubjectServiceImpl();
    IClassesService classservice = new ClassesServiceImpl();
	IStudentGradeService ig = new StudentGradeServiceImpl();
	IStudentExamService io = new StudentExamServiceImpl();
	
	@RequestMapping("allinput.do")
	public String showInput(select se,ModelMap map){
	
	    List<StudentExam> studentsExam = io.getStudentsExam(se.getCname(), se.getEname());
		
	    map.addAttribute("list", studentsExam);
		System.out.println(studentsExam.toString());
		return "main/inputexams";
		
	}
	
	
	@RequestMapping("allgrades.do--------")
	
	public String showClass(select se,ModelMap map){
	
	    List<StudentGrade> studentsGrade = ig.getStudentsGrade(se.getCname(), se.getEname());
		
	    map.addAttribute("list", studentsGrade);
		System.out.println(studentsGrade.toString());
		return "main/listAll";
		
	}
	
	@RequestMapping("allgrades.do")
	@ResponseBody
	public String showClasss(HttpServletRequest req){
	
	   String cname=req.getParameter("cname");
	   String ename=req.getParameter("ename");
	   List<StudentGrade> studentsGrade = ig.getStudentsGrade(cname, ename);
	   JSONArray json = new JSONArray();
		 for (StudentGrade sg : studentsGrade) {
			 JSONObject jo = new JSONObject();
			 jo.put("sno",sg.getSno()); 
			 jo.put("sname",sg.getSname()); 
			 jo.put("cname",sg.getCname());
			 jo.put("ename",sg.getEname()); 
			 jo.put("score",sg.getScore()); 
			 json.add(jo);
			 
		}
		System.out.println(json);
		System.out.println(json.toString());
		return json.toString();
		
	}
	
	
	
	
	
	@RequestMapping("input.do")
	public String results(){
		return "main/inputexams";
	}
	
	
	
	
	@RequestMapping("select.do")
	public String result(){
		return "allgrades.do";
	}
	
	
	@RequestMapping("selectclasses.do")
	@ResponseBody
	public String getClases(){
	List<Classes> allClasses = classservice.getAllClasses();
	System.out.println(allClasses.size());
	 JSONArray json = new JSONArray();
	 for (Classes cls : allClasses) {
		 JSONObject jo = new JSONObject();
		 jo.put("name",cls.getCname()); 
		 json.add(jo);
	}
	
  
    
	System.out.println(json);
	System.out.println(json.toString());
	return json.toString();

	}
	
	
	@RequestMapping("selectsubjects.do")
	@ResponseBody
	public String getSubjects(){
	List<Subject> subjects = subjectService.getSubjects();
	
	 JSONArray json = new JSONArray();
	 for (Subject cls : subjects) {
		 JSONObject jo = new JSONObject();
		 jo.put("name",cls.getSubname()); 
		 json.add(jo);
	}
	return json.toString();
	}
	
	
	
	@RequestMapping("selectexams.do")
	@ResponseBody
	public String getExams(HttpServletRequest req){
	System.out.println(req.getParameter("sub"));
	List<Exam> exams = examService.getExams(subjectService.getSubjectsSid(req.getParameter("sub")));
    System.out.println(exams.toString());
	 JSONArray json = new JSONArray();
	 for (Exam cls : exams) {
		 JSONObject jo = new JSONObject();
		 jo.put("name",cls.getEname()); 
		 json.add(jo);
	 }
	 System.out.println(json.toString());
	  return json.toString();

	}
	
}

