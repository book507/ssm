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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1}">
        <h1 align="center">兑换成功！</h1><br>
        <a href="/shop/queryAll?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">点此返回积分商城</button></a>

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
