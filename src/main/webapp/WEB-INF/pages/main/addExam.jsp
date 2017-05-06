<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
         <link rel="stylesheet" type="text/css"  href="/web12/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="/web12/css/font-awesome.min.css">
		<link rel="stylesheet" href="/web12/css/form-elements.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

</head>
<body style="background:#fff">
	<form id="f" action="addExam.do" method="post">
		<table class="table">
			<tr>
				<td>考试名称</td>
				<td><input type="input" name="ename" ></td>
			</tr>
			<tr>
				<td>班级名称</td>
				<td><select id="cId" name="cid">
					<c:forEach items="${classes}" var="c">
					
						<option value="${c.id }">${c.cname }</option>
						
					</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>科目名称</td>
				<td><select id="sId" name="stuid">
					<c:forEach items="${subjects }" var="s">
					
						<option value="${s.id }" >${s.subname }</option>
						
					</c:forEach>
				</select></td>
			</tr>
			    <td>考试时间:<input  class="Wdate"  id="date" name="date" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" ></td>></br>
				<td colspan="2"><input type="submit"></td>
			</tr>
		</table>

	</form>
	

      <script type="text/javascript" src="/web12/js/My97DatePicker/WdatePicker.js"></script>
</body>
</html>