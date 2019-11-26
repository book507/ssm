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
    <title>修改密码</title>
    <script type="text/javascript">
        function yz(){
            if(document.form.cNPwd.value!=document.form.rcNPwd.value){
                alert("输入的新密码与确认密码不一致！");
                return false;
            }
            if (document.form.cPwd.value==document.form.cNPwd.value) {
                alert("新密码与原密码一致，请重新修改！");
                return false;
            }
            if(document.form.cNPwd.value==document.form.rcNPwd.value&&document.form.cPwd.value!=document.form.cNPwd.value){
                alert("确认要修改您的密码？");
                return true;
            }
        }
    </script>
</head>
<body>
<form name="form" action="/customer/updatePass" method="post" OnSubmit="return yz();">
    <ul>
        <li style="list-style: none">原 密 码:<input type="password" id="cPwd" name="cPwd" required="required"></li>
        <li style="list-style: none">新 密 码:<input type="password" id="cNPwd" name="cNPwd" required="required"></li>
        <li style="list-style: none">确认密码:<input type="password" id="rcNPwd" name="rcNPwd" required="required"></li>
        <li style="list-style: none"><input type="text" name="cId" value="${cId}" hidden="hidden"></li>
        <li style="list-style: none">
            <input type="submit" value="提交">
            <input type="reset" value="重置">
        </li>
    </ul>
</form>
</body>
</html>
