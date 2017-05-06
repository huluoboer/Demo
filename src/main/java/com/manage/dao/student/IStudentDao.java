package com.manage.dao.student;

import java.util.List;

import com.manage.bean.Student;

public interface IStudentDao {
	
	//获取班级学生
     public List<Student> getClassStudents(int cid);
     //查找单个学生
     public Student getStudent(int sno);
     //修改学生
     public  int updateStudent(Student stu);
     
     
	 public List<Student> getAllStudents();
     
     
}
