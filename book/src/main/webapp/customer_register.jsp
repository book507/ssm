<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
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
<style>
    .basic-grey {
        margin-left:auto;
        margin-right:auto;
        max-width: 500px;
        background: #F7F7F7;
        padding: 25px 15px 25px 10px;
        font: 12px Georgia, "Times New Roman", Times, serif;
        color: #888;
        text-shadow: 1px 1px 1px #FFF;
        border:1px solid #E4E4E4;
    }
    .basic-grey h1 {
        font-size: 25px;
        padding: 0px 0px 10px 40px;
        display: block;
        border-bottom:1px solid #E4E4E4;
        margin: -10px -15px 30px -10px;;
        color: #888;
    }
    .basic-grey h1>span {
        display: block;
        font-size: 11px;
    }
    .basic-grey label {
        display: block;
        margin: 0px;
    }
    .basic-grey label>span {
        float: left;
        width: 20%;
        text-align: right;
        padding-right: 10px;
        margin-top: 10px;
        color: #888;
    }
    .basic-grey input[type="text"], .basic-grey input[type="password"],.basic-grey input[type="email"], .basic-grey textarea, .basic-grey select {
        border: 1px solid #DADADA;
        color: #888;
        height: 30px;
        margin-bottom: 16px;
        margin-right: 6px;
        margin-top: 2px;
        outline: 0 none;
        padding: 3px 3px 3px 5px;
        width: 70%;
        font-size: 12px;
        line-height:15px;
        box-shadow: inset 0px 1px 4px #ECECEC;
        -moz-box-shadow: inset 0px 1px 4px #ECECEC;
        -webkit-box-shadow: inset 0px 1px 4px #ECECEC;
    }
    .basic-grey textarea{
        padding: 5px 3px 3px 5px;
    }
    .basic-grey textarea{
        height:100px;
    }
    .basic-grey .button {
        background: #E27575;
        border: none;
        padding: 10px 25px 10px 25px;
        color: #FFF;
        box-shadow: 1px 1px 5px #B6B6B6;
        border-radius: 3px;
        text-shadow: 1px 1px 1px #9E3F3F;
        cursor: pointer;
    }
    .basic-grey .button:hover {
        background: #CF7A7A
    }
</style>
<body style="background: url(images/t5.jpg) ; background-size:100% 100% ; background-attachment: fixed">
<form action="/customer/register" method="post" class="basic-grey" onsubmit="return formCheck()">
    <h1 align="center">注册账号
    </h1>
    <p align="center">

        <input id="cNo" type="text" name="cNo" placeholder="请输入用户名" required="required"/>
    </p>
    <p align="center">

        <input id="cPwd" type="password" name="cPwd" placeholder="请输入密码" required="required"/>
    </p>

    <p align="center">

        <input id="recPwd" type="password" name="recPwd" placeholder="请确认密码" required="required"/>
    </p>
    <p align="center">

        <input id="cSfz" type="text" name="cSfz" placeholder="请输入您的身份证号" required="required"/>
    </p>


    <p align="center">
        <input type="submit" class="button" value="提交" />
    </p>
</form>
</body>
</html>
