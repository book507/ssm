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
<form class="form-horizontal" role="form">
    <div class="form-group">
        <label for="firstname" class="col-sm-2 control-label" style="color: #FCFCFC;">用户名</label>
        <div style="float: right;">
            <button type="button" class="btn btn-success"  onclick="window.location.href='admin.jsp'">我是管理员</button>
        </div>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="firstname"
                   placeholder="请输入用户名">
        </div>
    </div>
    <div class="form-group">
        <label for="lastname" class="col-sm-2 control-label" style="color: #FCFCFC;">密码</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="lastname"
                   placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="button" class="btn btn-danger" onclick="window.location.href='cus_index.jsp'">确认</button>
            &nbsp;&nbsp;&nbsp;
            <button type="submit" class="btn btn-danger">忘记密码</button>
            &nbsp;&nbsp;&nbsp;
            <button type="submit" class="btn btn-danger">注册账号</button>

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
