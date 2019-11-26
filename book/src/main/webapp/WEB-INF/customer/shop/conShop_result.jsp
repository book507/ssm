<%--
  Created by IntelliJ IDEA.
  User: lzz
  Date: 2019/11/24
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${rows==1}">
        <h3>兑换成功！</h3>
    </c:when>
    <c:when test="${rows==0}">
        <h3>兑换失败！</h3>
    </c:when>
    <c:otherwise>
        <h3>服务器出错！</h3>
    </c:otherwise>
</c:choose>
</body>
</html>
