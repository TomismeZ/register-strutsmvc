<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功界面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<style type="text/css">
#container1 {
	margin-left: 10px;
}
#container1 .header {
	font-weight: bold;
	font-size: 20px;
	line-height: 65px;
}
div {
	margin-top: 15px;
}
</style>
</head>
<body>
	<div id="container1">
		<header class="header"> 用户注册信息 </header>
		<hr>
		<div class="username">用户名称：${user.username }</div>
		<div class="password">登陆密码：${user.password }</div>
		<div class="confimPassword">重复密码：${user.confimPassword }</div>
		<div class="email">电子邮箱：${user.email }</div>
		<div class="sex">性别：${user.gender }</div>
		<div class="occupation">职业：${user.occupation }</div>
		<!-- <div class="hobby">爱好：${user.hobby[0]},${user.hobby[1]},${user.hobby[2]}</div> -->
		<div class="hobby">
			爱好：
			<c:forEach items="${user.hobby}" var="hobby" varStatus="status">           
         ${hobby},
  		</c:forEach>
		</div>
	</div>
</body>
</html>