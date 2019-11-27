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
    <title>订单处理结果页面</title>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1||rows==4}">
        <h1 align="center">亲，您的订单会尽快给你处理的！</h1>
        <br>
        <a href="/order/queryOrderOfCus?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">返回我的订单</button></a>
    </c:when>
    <c:when test="${rows==3}">
        <h1 align="center">亲，您的订单已经给你处理了！</h1>
        <br>
        <a href="/order/queryOrderOfCus?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">返回我的订单</button></a>
    </c:when>
    <c:when test="${rows==5}">
        <h1 align="center">亲，订单正在处理。。。！</h1>
        <br>
        <a href="/order/queryOrderOfCus?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">返回我的订单</button></a>
    </c:when>
    <c:when test="${rows==6}">
        <h1 align="center">已退款。。。！</h1>
        <br>
        <a href="/order/queryOrderOfCus?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">返回我的订单</button></a>
    </c:when>
    <c:otherwise>
        亲，不好意思，服务器出现异常啦！
        <a href="/order/queryOrderOfCus?cId=<%=session.getAttribute("userId")%>">请您重新操作</a>
    </c:otherwise>
</c:choose>
</body>
</html>
