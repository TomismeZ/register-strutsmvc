<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
String path=request.getContextPath();
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
    <script src="<%=path %>/js/register.js" type="text/javascript"></script>
</head>

<body>
    <div id="container">
        <form class="content" action="registerResult" method="post" accept-charset="utf-8" onsubmit="return registerValidate()">
            <header class="title">
                用户注册
            </header>
            <div class="username">
                用户名称:&nbsp;
                <input type="text" name="user.username" id="username" placeholder="请输入用户名！">
            </div>
            <div class="password">
                登陆密码:&nbsp;
                <input type="password" name="user.password" id="password" placeholder="请输入您的密码！">
            </div>
            <div class="confimPassword">
                重复密码:&nbsp;
                <input type="password" name="user.confimPassword" id="confimPassword" placeholder="请再输入您的确认密码！">
            </div>
            <div class="email">
                电子邮箱:&nbsp;
                <input type="email" name="user.email" id="email" placeholder="请输入您的邮箱！">
            </div>
            <div class="sex">
                性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:&nbsp;
                <input type="radio" name="user.gender" value="male" checked="checked" />男
                <input type="radio" name="user.gender" value="female">女
            </div>
            <div class="occupation">
                职&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业:&nbsp;&nbsp;
                <select name="user.occupation">
                    <option value="学生">学生</option>
                    <option value="教师">教师</option>
                    <option value="院长" selected="selected">院长</option>
                    <option value="校长">校长</option>
                </select>
            </div>
            <div class="hobby">
                爱&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;好:&nbsp;&nbsp;
                <select style="height: 78px;" multiple="multiple" name="user.hobby">
                    <option value="书法">书法</option>
                    <option value="乐器">乐器</option>
                    <option value="运动">运动</option>
                    <option value="编程">编程</option>
                </select>
            </div>
            <footer class="foot">
                <hr>
                  ${message } 
              <button type="submit" style="margin-left: 200px;">注册</button>
                <button type="reset">重置</button> 
            </footer>
          
        </form>
        
        <div class="footer">
            Copyright&copy;2017.轻实训版权所有
        </div>
    </div>
</body>

</html>