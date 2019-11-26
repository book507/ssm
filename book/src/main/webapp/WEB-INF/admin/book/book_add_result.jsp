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
    <title>书籍信息添加结果页面</title>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1}">
        <h1 align="center">添加成功</h1><br><a href="/book/book_add.action">继续添加</a>
        <br>
        <a href="/book/queryBookOfAdmin">查看书籍信息</a>
    </c:when>
    <c:otherwise>
        服务器异常
    </c:otherwise>
</c:choose>
</body>
</html>
