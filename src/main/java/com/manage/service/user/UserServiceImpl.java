package com.manage.service.user;

import com.manage.bean.User;
import com.manage.dao.user.IUserDao;
import com.manage.dao.user.UserDaoImpl;

public class UserServiceImpl implements IUserService {

	
	IUserDao userdao = new UserDaoImpl();
	
	
	//登陆查找Username
	@Override
	public User getLogin(String username) {
		// TODO Auto-generated method stub
		
		if(userdao.getOneUser(username)!=null){
		   return userdao.getOneUser(username);
		}
		   return null;
	}

}
