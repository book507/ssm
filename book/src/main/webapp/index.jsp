<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>黄金屋</title>
</head>
<body>

<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="images/wall.jpg" height="100%" width="100%"/>
</div>
<form class="form-horizontal" role="form" action="/customer/login" method="post">
    <div class="form-group">
        <label for="cNo" class="col-sm-2 control-label" style="color: #FCFCFC;">用户名</label>
        <div style="float: right;">
            <button type="button" class="btn btn-success"  onclick="window.location.href='/admin/admin_login.action'">我是管理员</button>
        </div>
        <div class="col-sm-10">
        <input type="text" class="form-control" id="cNo" name="cNo" required="required"
               placeholder="请输入用户名">
    </div>
    </div>
    <div class="form-group">
        <label for="cPwd" class="col-sm-2 control-label" style="color: #FCFCFC;">密码</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="cPwd" name="cPwd" required="required"
                   placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <input type="submit" class="btn btn-danger" value="登陆">
            &nbsp;&nbsp;&nbsp;
            <button type="button" class="btn btn-danger" onclick="window.location.href='customer/customer_findpwd.action'">忘记密码</button>
            &nbsp;&nbsp;&nbsp;
            <button type="button" class="btn btn-danger" onclick="window.location.href='customer/customer_register.action'">注册账号</button>

        </div>
        <br />
        <div class="col-sm-offset-2 col-sm-10">
        </div>
        <br />
        <br>
    </div>
</form>
</body>
</html>
