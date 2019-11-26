<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>找回密码结果页面</title>
    <meta http-equiv="refresh" content="3,/index.jsp"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1}">
        密码已修改成功，即将返回登录页面...
    </c:when>
    <c:when test="${rows==0}">
        用户名或身份证号码不正确!即将返回登录页面...
    </c:when>
    <c:otherwise>
        <h1 align="center">服务器异常</h1>
    </c:otherwise>
</c:choose>
</body>
</html>
