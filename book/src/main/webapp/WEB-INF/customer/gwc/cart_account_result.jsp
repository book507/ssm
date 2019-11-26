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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1}">
        <h1 align="center">结算成功</h1>
        <a href="/cart/queryBook?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">返回您的购物车</button></a>

    </c:when>
    <c:when test="${rows==0}">
        <h3>该宝贝不存在，结算失败!</h3>
    </c:when>
    <c:otherwise>
        <h3>服务器出错</h3>
    </c:otherwise>
</c:choose>
</body>
</html>
