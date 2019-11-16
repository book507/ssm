<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
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
<h3>用户注册</h3>
<form action="/customer/register" method="post" onsubmit="return formCheck()">
<ul>
    <li style="list-style: none">用户名:<input type="text" id="cNo" name="cNo"></li>
    <li style="list-style: none">密码:<input type="password" id="cPwd" name="cPwd"></li>
    <li style="list-style: none">确认密码:<input type="password" id="recPwd"></li>
    <li style="list-style: none">
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </li>
</ul>
</form>
</body>
</html>
