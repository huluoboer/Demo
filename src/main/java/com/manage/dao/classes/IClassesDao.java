package com.manage.dao.classes;

import java.util.List;

import com.manage.bean.Classes;

public interface IClassesDao {
	
	
      public List<Classes> getAllClasses();
      
      
      public Classes getOneClasses();
      public int  addClass(Class cla);
      public int  deleClass(Class cla);
      public int  updateClass(Class cla);
}
