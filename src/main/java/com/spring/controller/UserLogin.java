package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manage.bean.User;
import com.manage.service.user.IUserService;
import com.manage.service.user.UserServiceImpl;

@Controller
public class UserLogin {

	IUserService userservice = new UserServiceImpl();
	
    //跳转验证成功
	@RequestMapping("welcome.do")
	public String login(User User,ModelMap map){
		boolean flag=true;
		String message="";
		User user=userservice.getLogin(User.getUsername());
		if(user==null){
			message="用户名不存在";	
			flag=false;
		}
		else{
			if(!user.getPassword().equals(User.getPassword())){
				message="密码错误";
				flag=false;
			}			
		}
	
		if(flag){
			map.addAttribute("user", user);
			return "main/main";
			
		}
		else{  
			map.addAttribute("message", message);
			return "welcome/login";
		
	    }
	}
	
	//跳转登陆界面
	@RequestMapping("login.do")
	public String main(){
		return "welcome/login";
	}
	
	@RequestMapping("main.do")
	public String mains(){
		return "main/main";
	}
}
