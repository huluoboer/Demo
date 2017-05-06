<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link href="/web12/css/page.css" type="text/css" rel="stylesheet"/>


  
  
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
 
         <link rel="stylesheet" type="text/css"  href="/web12/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="/web12/css/font-awesome.min.css">
		<link rel="stylesheet" href="/web12/css/form-elements.css">
      
</head>
<body>

<nav class="navbar navbar-default">
    <select id="a" name="cname" class="opa">
         <option>请选择班级</option>
         </select>
         <select id="b" class="opb">
           <option>请选择科目</option>
           </select>
         <select  id="c"  name="ename" class="opc">
         
           <option>请选择考试</option>
           </select>
           <input id="d" type="button" class="btn" value="提交">
    </nav>
        <div class="container"> 
        <table class="table  table-bordered">
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>班级</th>
                <th>考试</th>
                <th>成绩</th>
               
            </tr>
            
        <tbody id="mytable">
        
          
        </tbody>
         </table>
        <ul class="page" id="page"></ul>
        </div>
            
   
     <script src="/web12/js/jquery-3.2.0.min.js"></script>
       <script type="text/javascript" src="/web12/js/page.js"></script>
     
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
				type : "post",
				data :{"sub":$(".opb").val()},
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
				
				
				
				var dat=123;
				d.onclick=function(){
					 
				
					$.ajax({
					url : "allgrades.do",
					type : "get",
					data :{"cname":$(".opa").val(),"ename":$(".opc").val()},
					dataType:"json",
					success : function(data) {
						 options={
								"id":"page",//显示页码的元素
								"data":data,//显示数据
							    "maxshowpageitem":3,//最多显示的页码个数
							    "pagelistcount":5,//每页显示数据个数
							    
							    "callBack":function(result){
							    	 var cHtml="";
							    	 console.log(result)
							        	 
							   for(var i=0;i<result.length;i++){
								   cHtml+="<tr><td>"+ result[i].sno+"</td>"
								   +"<td>"+ result[i].sname+"</td>"
								   +"<td>"+ result[i].cname+"</td>"
								   +"<td>"+ result[i].ename+"</td>"
								   +"<td>"+ result[i].score+"</td>"
								   "</tr>";
							   }
							                   
							        
							    	  $("#mytable").html(cHtml)
							    }
						    };
							
						 page.init(data.length,1,options);
						  
					}
					})
					

				}
				
				
			}
			
			 
       </script>
</body>
</html></html>