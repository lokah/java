<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<hi><%=request.getParameter("myname")%> 님의 주소는 
	<%=request.getParameter("myaddr")%>입니다.</hi>



</body>
</html>