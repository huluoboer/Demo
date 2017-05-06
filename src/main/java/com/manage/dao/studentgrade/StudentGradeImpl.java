package com.manage.dao.studentgrade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.manage.bean.StudentGrade;
import com.manage.commom.JdbcUtil;
import com.manage.commom.RowMap;

public class StudentGradeImpl implements IStudentGradeDao,RowMap<StudentGrade> {

	String sql="SELECT stu.sno ,sname, cname,ename,score from students stu,classes cls,exam ex,grade gr where stu.sno=gr.sno and ex.id=gr.eid and cls.id=stu.cid  and cname=? and ename=?";
	String sql1="SELECT gr.sno ,sname, cname,ename,score from students stu,classes cls,exam ex,grade  gr where stu.sno=gr.sno and ex.id=gr.eid and stu.cid=cls.id and stu.sno=?";
	
	//班级成绩单
	@Override
	public List<StudentGrade> getStudentsGrade(String cname, String ename) {
		// TODO Auto-generated method stub
		return JdbcUtil.findAll(sql, this, cname,ename);
	}
	//个人成绩单
	public List<StudentGrade> getOneStudentGrade(int sno){
		// TODO Auto-generated method stub
		return JdbcUtil.findAll(sql1, this ,sno);
	}

	@Override
	public StudentGrade rowMapping(ResultSet rs) {
		// TODO Auto-generated method stub
		StudentGrade sg = new StudentGrade();
		try {
			sg.setSno(rs.getInt("sno"));
			sg.setSname(rs.getString("sname"));
			sg.setCname(rs.getString("cname"));
			sg.setEname(rs.getString("ename"));
			sg.setScore(rs.getInt("score"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return sg;
	}

}
