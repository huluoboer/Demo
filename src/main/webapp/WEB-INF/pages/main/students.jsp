<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
 
         <link rel="stylesheet" type="text/css"  href="/web12/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="/web12/css/font-awesome.min.css">
		<link rel="stylesheet" href="/web12/css/form-elements.css">
      
</head>
<body>


<table class="table">
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>班级ID</th>
                <th>操作</th>
               
               
            </tr>
             <c:forEach var="stu" items="${list}">
                <tr>
                    <td>${stu.sno }</td>
                    <td>${stu.sname }</td>
                    <td>${stu.sex}</td>
                    <td>${stu.cid }</td>
                    <td><a href="">删除</td>
                  
                </tr>
            </c:forEach>
          
        </table>
</body>
</html>