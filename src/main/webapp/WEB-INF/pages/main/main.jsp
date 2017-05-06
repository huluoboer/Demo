<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
 
         <link rel="stylesheet" type="text/css"  href="/web12/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="/web12/css/font-awesome.min.css">
		<link rel="stylesheet" href="/web12/css/form-elements.css">
      
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{margin:0;padding:0;}
	body{
		height:100vh;
	}
	.content{
		display:flex;
		flex-direction:column;
		height:100%;
	}
	.content .bodyer{
		flex:1;
		display:flex;
	}
	.content .bodyer .left{
		width:200px;
		border-right:1px solid #000;
	}
	.content .bodyer .right{
		flex:1;
	
	}
	
	
	.aaa li a{
	 padding-left:40px;
	}
	.bbb{
	 padding-right:40px;
	}
		
	
	</style>
</head>
<body>
 
 <div class="content">
 
   <nav class="navbar navbar-default">
    <div class="navbar-center">
      <a class="navbar-brand " href="#">成绩管理系统</a>
    </div>
     
    <div class="navbar-right bbb">
  
    <a class="navbar-brand " href="#">欢迎你：${user.username }</a>
    </div>
    <div class="dropdown navbar-right bbb">
     <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
     <li>...</li>
     <li></li>
      <li></li>
   </ul>
   </div>
 
  
    
  </nav>
 

<div class="bodyer">

       	<div class="left">
		
				<ul class="nav nav-pills nav-stacked ">
					
						<li  class="disabled"><a href="javascript:void(0)">基本信息维护</a>
							<ul class="nav nav-pills nav-stacked  aaa">
								
									<li ><a target="frame" href="user.do">用户信息</a></li>
								
									<li ><a target="frame" href="classes.do">班级信息</a></li>
								
									<li ><a target="frame" href="student.do">学生信息</a></li>
								
									<li ><a target="frame" href="subject.do">科目信息</a></li>
								
							</ul>
						</li>
					
						<li  class="disabled"><a href="javascript:void(0)" >学生成绩管理</a>
							<ul class="nav nav-pills nav-stacked aaa">
								
									<li><a target="frame" href="exam.do">考试管理</a></li>
								    <li><a target="frame" href="input.do">录入成绩</a></li>
									<li><a target="frame" href="selectgrade.do">查询成绩</a></li>
								
							</ul>
						</li>	
				</ul>
			</div>
			
			
			<div class="right">
				<iframe name="frame" style="border:0px;width:100%;height:900px"></iframe>
			</div>
	</div>
</div>
       
      <script src="/web12/js/jquery-3.2.0.min.js"></script>
     <script type="text/javascript" src="/web12/js/bootstrap.min.js"></script>
</body>
</html>