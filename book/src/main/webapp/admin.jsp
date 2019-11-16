<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<h3>管理员登录</h3>
<form action="/admin/Login" method="post">
    <ul>
        <li style="list-style: none">用户名:<input type="text" name="adminNo"></li>
        <li style="list-style: none">密码:<input type="password" name="adminPassword"></li>
        <li style="list-style: none">
            <input type="submit" value="登录">
            <input type="reset" value="重置">
        </li>
    </ul>
</form>
</body>
</html>
