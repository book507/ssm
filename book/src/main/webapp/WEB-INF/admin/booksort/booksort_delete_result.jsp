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
    <title>书籍分类删除结果页面</title>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1}">
        <h1 align="center">删除成功</h1>
        <br>
        <a href="/booksort/queryBooksort" ><button type="button" class="btn-primary">查看其他书籍分类信息</button></a>
    </c:when>
    <c:when test="${rows==0}">
        <h1 align="center">删除不成功，该分类下有书籍信息</h1>
        <br>
        <a href="/booksort/queryBooksort" ><button type="button" class="btn-primary">查看其他书籍分类信息</button></a>
    </c:when>

    <c:otherwise>
        服务器异常<a href="/booksort/queryBooksort" >请重新操作</a>
    </c:otherwise>
</c:choose>
</body>
</html>
