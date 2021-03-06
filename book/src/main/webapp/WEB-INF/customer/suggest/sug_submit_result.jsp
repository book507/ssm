<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>意见反馈结果页面</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<c:choose>
    <c:when test="${rows==1}">
        <h1 align="center">感谢您的宝贵意见，小店会认真阅读</h1><br>
        <a href="/customer/cus_index.action" ><button type="button" class="btn-primary">返回</button></a>
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
