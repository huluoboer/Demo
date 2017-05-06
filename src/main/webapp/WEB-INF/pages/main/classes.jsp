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
<table  class="table">
            <tr>
                <th>班级编号</th>
                <th>班级名称</th>
                
               
            </tr>
             <c:forEach var="cla" items="${list}">
                <tr>
                    <td>${cla.id }</td>
                    <td>${cla.cname }</td>
                    
                  
                </tr>
            </c:forEach>
          
        </table>
</body>
</html>