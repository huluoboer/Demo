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
<form action="allgrades.do" method="get">

<nav class="navbar navbar-default">
    <select id="a" name="cname">
         <option>请选择班级</option>
         </select>
         <select id="b" class="opp">
           <option>请选择科目</option>
           </select>
         <select  id="c"  name="ename">
         
           <option>请选择考试</option>
           </select>
           <input type="submit" class="btn">
    </nav>
         
</form>
        <table  class="table  table-bordered">
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>班级</th>
                <th>考试</th>
                <th>成绩</th>
               
            </tr>
           
            <c:forEach var="stugrade" items="${list}">
                <tr class="success">
                    <td>${stugrade.sno }</td>
                    <td>${stugrade.sname }</td>
                    <td>${stugrade.cname}</td>
                    <td>${stugrade.ename }</td>
                    <td>${stugrade.score }</td>
                  
                </tr>
            </c:forEach>
          
        </table>

   
     <script src="/web12/js/jquery-3.2.0.min.js"></script>
	   <script type="text/javascript">
	    var  opa=document.getElementById("a");
	    var  opb=document.getElementById("b");
	    var  opc=document.getElementById("c");
	     
			$.ajax({
				url : "selectclasses.do",
				type : "post",
				dataType:"text",
				data : $("#ff").serialize(),
				success : function(data) {
					for(var i=0;i<JSON.parse(data).length;i++){
					      var oo=document.createElement("option");
					      
					        oo.text=JSON.parse(data)[i].name;
					        oo.value=JSON.parse(data)[i].name;
							
							opa.appendChild(oo);
					} 
				}  
			     
					    
				})   
				
			$.ajax({
				url : "selectsubjects.do",
				type : "post",
				dataType:"text",
				data : $("#b").serialize(),
				success : function(data) {
					for(var i=0;i<JSON.parse(data).length;i++){
					      var oo=document.createElement("option");
					      
					        oo.text=JSON.parse(data)[i].name;
							
							opb.appendChild(oo);
					} 
				}  
			     
					    
				})   
	      
				
				
				
				b.onchange=function(){
			 
				
				$.ajax({
				url : "selectexams.do",
				type : "get",
				data :{"sub":$(".opp").val()},
				dataType:"json",
				success : function(data) {
					c.options.length=0;
					for(var i=0;i<data.length;i++){
					      var oo=document.createElement("option");
					      
					        oo.text=data[i].name;
							
							opc.appendChild(oo);
					 
				}  
				}
					    
				})   
				
				
			}
				
				
				
       </script>
</body>
</html>