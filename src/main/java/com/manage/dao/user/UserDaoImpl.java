package com.manage.dao.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.manage.bean.User;
import com.manage.commom.JdbcUtil;
import com.manage.commom.RowMap;

public class UserDaoImpl implements IUserDao, RowMap<User> {
   String sqlfindall="";
   String sqlfindone="select id,username,password from user where username=?";
   
   
   //返回全部
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method userb
		return JdbcUtil.findAll(sqlfindall,this,null);
	}
    //登陆验证User
	@Override
	public User getOneUser(String username) {
		// TODO Auto-generated method userb
		return JdbcUtil.findOne(sqlfindone, this, username);
	}
    //实现具体RowMap(ResultSet:User)
	@Override
	public User rowMapping(ResultSet rs) {
		// TODO Auto-generated method userb
		User user = new User();
		try {
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
		
	}



	
}
