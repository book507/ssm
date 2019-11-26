<%--
  Created by IntelliJ IDEA.
  User: lzz
  Date: 2019/11/23
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>意见反馈结果页面</title>
</head>
<body>
<c:choose>
    <c:when test="${rows==1}">
        <h3>亲，您的意见提交了哦</h3><a href="/customer/cus_index.action">返回</a>
    </c:when>
    <c:when test="${rows==0}">
        <h3>提交失败了</h3><a href="/customer/cus_index.action">返回</a>
    </c:when>
    <c:otherwise>
        <h3>服务器出现异常</h3><a href="/customer/cus_index.action">返回</a>
    </c:otherwise>
</c:choose>
</body>
</html>
