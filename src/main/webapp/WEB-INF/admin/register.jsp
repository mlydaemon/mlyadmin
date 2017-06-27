<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Login Page</title>  
</head>  
<body>  
   <div style="color:red; font-size:22px;">${message_login}</div>  
  
	<form action="<%=request.getContextPath()%>/admin/register" method="POST">  
	    昵称：<input type="text" name="nickname"/><br/>   
	    账号：<input type="text" name="account"/><br/>  
	    密码：<input type="text" name="password"/><br/>
	    重复密码：<input type="text" name="repassword"/><br/>  
	    验证：<input type="text" name="verifyCode"/>  
	         &nbsp;&nbsp;  
	         <img id="verifyCodeImage" onclick="reloadVerifyCode()" src="<%=request.getContextPath()%>/admin/getVerifyCodeImage"/><br/>  
	    <input type="submit" value="确认"/>  
	</form> 
</body>  
</html>