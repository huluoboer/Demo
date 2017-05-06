package com.manage.dao.user;

import java.util.List;


import com.manage.bean.User;

public interface IUserDao {
	public List<User> getUsers();
	//Login in
	public User getOneUser(String username);
	
	

}
