<%--
  Created by IntelliJ IDEA.
  User: Wing
  Date: 2019/11/17
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body>
    <ul>
        <li style="list-style: none">用户名:${requestScope.customer.cNo}</li>
        <li style="list-style: none">身份证号码:${requestScope.customer.cSfz}</li>
        <li style="list-style: none">姓名:${requestScope.customer.cName}</li>
        <li style="list-style: none">性别:${requestScope.customer.cSex}</li>
        <li style="list-style: none">联系方式:${requestScope.customer.cTel}</li>
        <li style="list-style: none">收货地址:${requestScope.customer.cAddress}</li>
        <li style="list-style: none">积分:${requestScope.customer.cGrade}</li>
        <li style="list-style: none">
            <button><a href="/customer/loadInfo?cId=<%=session.getAttribute("userId")%>" style="text-decoration: none">更新信息</a></button>
            <button><a href="#" style="text-decoration: none">修改密码</a></button>
            <button><a href="../customer_main.jsp" style="text-decoration: none">返回</a></button>
        </li>
    </ul>
</body>
</html>
