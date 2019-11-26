<%--
  Created by IntelliJ IDEA.
  User: lzz
  Date: 2019/11/22
  Time: 19:08
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
           <h3>该书本已成功添加到您的购物车</h3>
           <a href="/cart/queryBook?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">进入您的购物车</button></a>
       </c:when>
       <c:when test="${rows==0}">
           添加书本失败<a href="/cart/queryBook?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">重新操作</button></a>
       </c:when>
       <c:otherwise>
           服务器出错<a href="/cart/queryBook?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">重新刷新</button></a>
       </c:otherwise>
   </c:choose>
</body>
</html>
