<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css"  href="/web12/css/bootstrap.min.css"/>
      
</head>
<body>
<table class="table">
            <tr>
                <th>科目编号</th>
                <th>科目名称</th>
                 <th>科目名称</th>
                  <th>科目名称</th>
              
               
            </tr>
             <c:forEach var="sub" items="${list}">
                <tr>
                    <td>${sub.id }</td>
                    <td>${sub.subname }</td>
                     <td>科目名称</td>
                      <td>科目名称</td>
                   
                </tr>
            </c:forEach>
          
        </table>

</body>
</html>