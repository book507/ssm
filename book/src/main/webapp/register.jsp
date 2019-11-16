<%--
  Created by IntelliJ IDEA.
  User: Wing
  Date: 2019/11/15
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<h3>用户注册</h3>
<form action="/user/register" method="post">
<ul>
    <li style="list-style: none">用户名:<input type="text" name="username"></li>
    <li style="list-style: none">密码:<input type="password" name="password"></li>
    <li style="list-style: none">确认密码:<input type="password" name="repassword"></li>
    <li style="list-style: none">
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </li>
</ul>
</form>
</body>
</html>
