<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>密码修改结果页面</title>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/sky.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1}">
        <h1 align="center">密码修改成功</h1>
        <br>
        <a href="/customer/lookInfo?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">返回</button></a>
    </c:when>
    <c:when test="${rows==0}">
        <h1 align="center">输入的原密码不对，密码修改失败</h1>
        <br>
        <a href="/customer/lookInfo?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">返回</button></a>
    </c:when>
    <c:otherwise>
        服务器异常<a href="/customer/lookInfo?cId=<%=session.getAttribute("userId")%>" >请重新修改</a>
    </c:otherwise>
</c:choose>
</body>
</html>
