package com.manage.service.classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.manage.bean.Classes;

import com.manage.dao.classes.ClassesDaoImpl;
import com.manage.dao.classes.IClassesDao;

public class ClassesServiceImpl implements IClassesService{

	IClassesDao ids= new ClassesDaoImpl();
	
	@Override
	public List<Classes> getAllClasses() {
		// TODO Auto-generated method stub
		return ids.getAllClasses();
	}
	

}
