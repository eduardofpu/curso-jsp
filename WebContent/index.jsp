<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="data" scope="page" value="${500*6}"/>
<c:out value="${data}"></c:out>

<p/>
<p/>
<p/>
<p/>


	<h1>Bem vindo curos JSP</h1>


	<form action="LoginServlet" method="post">

		Login: <input type="text" id="login" name="login"><br />

		Senha: <input type="password" id="senha" name="senha"> <input
			type="submit" value="Enviar"></input>

	</form>
	
	



</body>
</html>