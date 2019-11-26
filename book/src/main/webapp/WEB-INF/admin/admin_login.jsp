<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>黄金屋后台登录</title>

    <script type="text/javascript">
        function yz(){
            if(document.form.adminNo.value==""){
                alert("账号不能为空！");
                return false;}
            if(document.form.adminPassword.value==""){
                alert("密码不能为空！");
                return false;}
        }
    </script>

</head>
<body>

<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../images/t6.jpg" height="100%" width="100%"/>
</div>
<form action="/admin/login" method="post" class="form-horizontal" name="form" role="form" OnSubmit="return yz();">
    <div class="form-group">
        <label for="firstname" class="col-sm-2 control-label" style="color: #FCFCFC;">账号</label>
        <div style="float: right;">
            <a href="../../index.jsp"><button type="button" class="btn btn-info">我是用户</button></a>
        </div>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="firstname" name="adminNo"
                   placeholder="请输入账号">
        </div>
    </div>
    <div class="form-group">
        <label for="lastname" class="col-sm-2 control-label" style="color: #FCFCFC;">密码</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="lastname" name="adminPassword"
                   placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-warning">确认</button>
            <button type="reset" class="btn btn-danger">重置</button>
        </div>
    </div>
</form>
</body>
</html>
