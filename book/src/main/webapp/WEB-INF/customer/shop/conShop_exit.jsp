<%--
  Created by IntelliJ IDEA.
  User: lzz
  Date: 2019/11/24
  Time: 22:11
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
<h1 align="center">不好意思，您的积分不够兑换该商品！</h1><br>
<a href="/shop/queryAll?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">点此返回积分商城</button></a>

</body>
</html>
