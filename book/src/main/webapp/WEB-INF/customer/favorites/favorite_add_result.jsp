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
</head>
<body>
   <c:choose>
       <c:when test="${rows==1}">
           <h3>该书本成功添加到您的收藏夹啦</h3>
           <a href="/favorite/queryBook?cId=<%=session.getAttribute("userId")%>" ><button type="button" class="btn-primary">进入您的收藏夹</button></a>
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
