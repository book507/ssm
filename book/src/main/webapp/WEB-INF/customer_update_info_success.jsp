<%--
  Created by IntelliJ IDEA.
  User: Wing
  Date: 2019/11/18
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新成功</title>
</head>
<body>
更新个人信息成功！点击<a href="/customer/lookInfo?cId=<%=session.getAttribute("userId")%>">返回个人信息页面</a>
</body>
</html>
