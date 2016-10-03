<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- /helloMVC/doLogin  이건 submit했을때 넘어가는 URL임 (request)라는 말임--> 
	<form action="/helloMVC/doLogin" method="get"> 
		Customer ID(id001, id002, id003, id004, id005):
		<input type="text" name="customerId" /> <br/>
		<input type="submit" value="press" />
	</form>
</body>
