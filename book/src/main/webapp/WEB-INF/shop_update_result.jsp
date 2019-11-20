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
    <title>积分商品修改结果页面</title>
</head>
<body>
<c:choose>
    <c:when test="${rows==1}">
        修改成功<a href="/shop/queryShop">查看积分商品</a>
    </c:when>
    <c:otherwise>
        服务器异常
    </c:otherwise>
</c:choose>
</body>
</html>
