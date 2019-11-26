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
           <h1 align="center">该书本已成功添加到收藏夹</h1>
           <br>
           <a href="/favorite/queryBook?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">点此进入收藏夹</button></a>
       </c:when>
       <c:when test="${rows==0}">
           添加书本失败<a href="/favorite/queryBook?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">重新操作</button></a>
       </c:when>
       <c:otherwise>
           服务器出错<a href="/favorite/queryBook?cId<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">重新刷新</button></a>
       </c:otherwise>
   </c:choose>
</body>
</html>
