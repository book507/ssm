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
    <title>宝贝移出结果页面</title>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1}">
        <h1 align="center">亲，您的宝贝已成功移除了哦！</h1>
        <br>
        <a href="/cart/queryBook?cId=${cId}" ><button type="button" class="btn-primary">返回您的购物车</button></a>
    </c:when>
    <c:otherwise>
        亲，不好意思，服务器出现异常啦！
        <a href="/cart/queryBook?cId=${cId}">请您重新操作</a>
    </c:otherwise>
</c:choose>
</body>
</html>
