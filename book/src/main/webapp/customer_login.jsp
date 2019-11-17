<%--
  Created by IntelliJ IDEA.
  User: Wing
  Date: 2019/11/17
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<h3>用户登录</h3>
<form action="/customer/login" method="post">
    <ul>
        <li style="list-style: none">用户名:<input type="text" name="cNo" required="required"></li>
        <li style="list-style: none">密码:<input type="password" name="cPwd" required="required"></li>
        <li style="list-style: none">
            <input type="submit" value="提交">
            <input type="reset" value="重置">
            <a href="customer_findpass.jsp">忘了密码?</a>
        </li>
    </ul>
</form>
</body>
</html>
