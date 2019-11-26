<%--
  Created by IntelliJ IDEA.
  User: yes
  Date: 2019/11/19
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>注册结果</title>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1}">
        <h1 align="center" style="color: white">注册成功</h1><br>
        <button type="button" class="btn btn-info" onclick="window.location.href='/index.jsp'">返回登录</button>

    </c:when>
    <c:when test="${rows==0}">
        <h1 align="center">该用户已存在，请登录</h1><br>
        <button type="button" class="btn btn-info" onclick="window.location.href='/index.jsp'">返回登录</button>

    </c:when>
    <c:otherwise>
        <h1 align="center">服务器异常</h1><a href="/index.jsp">重新加载一下</a>
    </c:otherwise>
</c:choose>
</body>
</html>
