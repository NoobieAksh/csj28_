<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginServletDB</title>
</head>
<center>
<body bgcolor="SkyBlue">
<%
	Cookie[] cookies = request.getCookies();
	String userName="", password="", rememberVal="";
	if(cookies!=null){
		for(Cookie cookie: cookies){
			if(cookie.getName().equals("cookUser")){
				userName = cookie.getValue();
			}
			if(cookie.getName().equals("cookPass")){
				password = cookie.getValue();
			}
			if(cookie.getName().equals("cookRem")){
				rememberVal = cookie.getValue();
			}
		}
	}
%>
<h2>Login</h2>
<%=request.getAttribute("msg")!=null ? request.getAttribute("msg") : "" %>
<form action="MyServlet">
UserName: <input type="text" name="t1" value="<%=userName %>"><br>
Password: <input type="password" name="t2" value="<%=password %>"><br>

<input type="checkbox" name="remember" value="1"
<%="1".equals(rememberVal.trim()) ? "checked=\"checked\"" : "" %>>
<label>Remember</label><br>
<br>
<input type="submit" value="Login">
<input type="reset" value="Reset">
</form>
</center>
</body>
</html>