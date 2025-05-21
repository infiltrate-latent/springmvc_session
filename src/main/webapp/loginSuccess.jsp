<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>${sessionScope.user.uname }so hot!!!</h1>
  <h1>${sessionScope.user.pwd }so hot!!!</h1>
 <h1>requestScope${requestScope.dog.name }so hot!!!</h1>
 <h1>requestScope${requestScope.dog.age }so hot!!!</h1>
 <h1>user1.uname ${requestScope.user.uname }so hot!!!</h1>
 <h1>user1.uname ${requestScope.user.uname }so hot!!!</h1>
 <h1>user1.uname ${sessionScope.user1.uname }so hot!!!</h1>
 <h1>user1.uname ${requestScope.user1.uname }so hot!!!</h1>
  <h1>user1.pwd ${requestScope.user1.pwd }so hot!!!</h1>
  <h2>tease+${sessionScope.uname1}</h2>
    <h2>Book+${requestScope.book}</h2> 
</body>
</html>