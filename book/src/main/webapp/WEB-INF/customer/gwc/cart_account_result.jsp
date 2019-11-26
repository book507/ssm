<%--
  Created by IntelliJ IDEA.
  User: lzz
  Date: 2019/11/23
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>结算结果</title>
</head>
<body>
<c:choose>
    <c:when test="${rows==1}">
        <h3>您的宝贝已结算成功了哦</h3>
    </c:when>
    <c:when test="${rows==0}">
        <h3>该宝贝不存在，结算失败了</h3>
    </c:when>
    <c:otherwise>
        <h3>服务器出错</h3>
    </c:otherwise>
</c:choose>
</body>
</html>
