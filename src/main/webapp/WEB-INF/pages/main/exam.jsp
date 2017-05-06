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

<a   id="add"  href="preaddExam.do">add</a>
<table  class="table">
            <tr>
                <th>班级名称</th>
                <th>科目名称</th>
                <th>考试名称</th>
                 <th>考试时间</th>
                  <th>录入成绩</th>
                 
                
               
            </tr>
             <c:forEach var="exam" items="${list}">
                <tr>
                    <td>${exam.cname }</td>
                    <td>${exam.subname }</td>
                    <td>${exam.ename}</td>
                     <td>${exam.time}</td>
                      <td>${exam.flag}</td>
                   
                  
                </tr>
            </c:forEach>
          
        </table>
           
        <script type="text/javascript" src="/js/jquery-3.2.0.min.js"></script>
      
	    <script type="text/javascript">  
          
			</script>
</body>
</html>