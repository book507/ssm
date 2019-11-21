<%--
  Created by IntelliJ IDEA.
  User: Wing
  Date: 2019/11/19
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码功能</title>
    <script type="text/javascript">
        /*判断密码是否正确和新密码是否一致*/
        function checkPass() {
            var pass = document.getElementById("cNpwd").value;
            var repass = document.getElementById("rcNpwd").value;
            if (pass != repass) {
                document.getElementById("tip").innerHTML="<font color='red'>两次密码不相同</font>";
                document.getElementById("button").disabled = true;
            }
        }
    </script>
</head>
<body>
<form action="/customer/updatePass" method="post" onclick="return checkPass()">
    <ul>
        <li style="list-style: none">新的密码:<input type="password" id="cNpwd" name="cPwd" required="required"></li>
        <li style="list-style: none">确认密码:<input type="password" id="rcNpwd"  required="required"></li>
        <li style="list-style: none"><input type="text" name="cId" value="<%=session.getAttribute("userId")%>" hidden="hidden"></li>
        <li style="list-style: none">
            <input type="submit" value="提交">
            <input type="reset" value="重置">
        </li>
    </ul>
</form>
</body>
</html>
