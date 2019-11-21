<%--
  Created by IntelliJ IDEA.
  User: Wing
  Date: 2019/11/18
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新个人信息</title>
</head>
<body>
<h3>更新个人信息</h3>
<form action="/customer/updateInfo" method="post">
    <ul>
        <li style="list-style: none">用户名:<input type="text" name="cNo" readonly="readonly" value="${requestScope.customer.cNo}"></li>
        <li style="list-style: none">身份证号码:<input type="text" name="cSfz" required="required" value="${requestScope.customer.cSfz}"></li>
        <li style="list-style: none">姓名:<input type="text" name="cName" required="required" value="${requestScope.customer.cName}"></li>
        <li style="list-style: none">性别:<input type="tel" name="cSex" required="required" value="${requestScope.customer.cSex}"></li>
        <li style="list-style: none">联系方式:<input type="tel" name="cTel" required="required" value="${requestScope.customer.cTel}"></li>
        <li style="list-style: none">收货地址:<input type="text" name="cAddress" required="required" value="${requestScope.customer.cAddress}"></li>
        <li style="list-style: none">积分:<input type="text" name="cGrade" readonly="readonly" value="${requestScope.customer.cGrade}"></li>
        <li style="list-style: none"><input type="text" name="cId" value="<%=session.getAttribute("userId")%>>" hidden="hidden"></li>
        <li style="list-style: none">
            <input type="submit" value="提交">
            <input type="reset" value="重置">
            <button><a href="/customer/lookInfo?cId=<%=session.getAttribute("userId")%>" style="text-decoration: none">返回</a></button>
        </li>
    </ul>
</form>
</body>
</html>
