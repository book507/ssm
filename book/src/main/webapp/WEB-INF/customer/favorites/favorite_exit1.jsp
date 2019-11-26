<%--
  Created by IntelliJ IDEA.
  User: lzz
  Date: 2019/11/22
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/suc.jpg" height="100%" width="100%"/>
</div>
<h1 align="center">您的收藏夹里已有该宝贝了！不用重新添加啦</h1><br>
<a href="/favorite/queryBook?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">返回您的收藏夹</button></a>
</body>
</html>
