package com.manage.bean;

import java.util.Date;

import lombok.Data;

@Data
public class Exam {
   private int id;
   private String ename;
   private int stuid;
   private int flag;
   private Date date;
   private int cid;
}
