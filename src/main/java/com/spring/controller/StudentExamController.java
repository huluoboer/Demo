package com.spring.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manage.bean.Grade;
import com.manage.service.exam.ExamServiceImpl;
import com.manage.service.exam.IExamService;
import com.manage.service.grade.GradeService;
import com.manage.service.grade.IGradeService;




@Controller
public class StudentExamController {

	IGradeService ise=new GradeService();
	IExamService iee = new ExamServiceImpl();
	
	//添加数据
	@RequestMapping("test.do")
	public  String getAdds(HttpServletRequest res){
		Enumeration<String> keys = res.getParameterNames();
		System.out.println("......................");
		String ne = keys.nextElement();
	    System.out.println(ne);
	  Integer eid=Integer.parseInt(res.getParameter(ne));
		while(keys.hasMoreElements()){
			Integer n = Integer.parseInt(keys.nextElement());
			Integer sss=Integer.parseInt(res.getParameter(n+""));
			Grade gg = new Grade();
			gg.setEid(eid);
			gg.setSid(n);
			gg.setScore(sss);
			ise.addGrade(gg);
			System.out.println(n);
			System.out.println(sss);
		}
	       iee.updateExamFlag(eid);
		return "main/inputexams";
		
		
	}
	
	
}
