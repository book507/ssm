<%--
  Created by IntelliJ IDEA.
  User: Wing
  Date: 2019/11/17
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>找回密码</title>
    <script type="text/javascript">
        /*判断密码是否一致*/
        function formCheck(){
            var pass = document.getElementById("cPwd").value;
            var repass = document.getElementById("recPwd").value;
            if(pass!=repass){
                alert("两次输入的密码不一致！");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<h3>密码找回</h3>
<form action="/customer/findPass" method="post" onsubmit="return formCheck()">
    <ul>
        <li style="list-style: none">用户名:<input type="text" id="cNo" name="cNo" required="required" ></li>
        <li style="list-style: none">身份证号码:<input type="text" name="cSfz" required="required" ></li>
        <li style="list-style: none">新的密码:<input type="password" id="cPwd" name="cPwd" required="required"></li>
        <li style="list-style: none">确认密码:<input type="password" id="recPwd" required="required"></li>
        <li style="list-style: none">
            <input type="submit" value="提交">
            <input type="reset" value="重置">
        </li>
    </ul>
</form>
</body>
</html>
