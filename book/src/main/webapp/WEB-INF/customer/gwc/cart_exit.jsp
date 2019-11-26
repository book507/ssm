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
</head>
<body>
<h3>您的收藏夹里已有该宝贝了！不用重新添加啦</h3>
<a href="/cart/queryBook?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">进入您的购物车</button></a>
</body>
</html>
