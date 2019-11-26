<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/18
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        body, dd, div, dl, dt, form, h1, h2, h3, h4, h5, h6, input, li, ol, p, td, textarea, th, ul {
            margin: 0;
            padding: 0;
        }
        .user-setting-warp {
            padding: 20px 20px 0;
            position: relative;
        }
        .security-right {
            float: left;
            width: 829px;
            border-left: 1px solid #ddd;
            background: #fff;
            min-height: 890px !important;
        }
        .security_content {
            overflow: hidden;
            width: 980px;
            height: 100%;
            margin: 10px auto 100px;
            border: 1px solid #e1e2e5;
            box-shadow: 0px 2px 4px rgba(0,0,0,0.14);
            background: #fafafa;
            border-radius: 4px;
        }
        #app {
            position: relative;
        }
        body {
            font: 12px/1.5 Microsoft YaHei, tahoma, \5B8B体, sans-serif;
            color: #717171;
            font-size: 12px;
            font-family: MicrosoftYaHei;
        }
        .clearfix::after {
            content: ".";
            display: block;
            height: 0px;
            clear: both;
            visibility: hidden;
        }
        .el-form-item {
            margin-bottom: 22px;
        }
        .user-local, .user-my-aim, .user-my-btn, .user-my-date, .user-my-love, .user-my-sex, .user-my-sign, .user-nick-name, .user-nick-rel-name {
            float: left;
            width: 789px;
        }
        .el-form-item__content {
            line-height: 36px;
            position: relative;
            font-size: 14px;
        }
        .el-form-item__content {
            line-height: 30px;
        }
        .el-breadcrumb::after, .el-breadcrumb::before, .el-button-group::after, .el-button-group::before, .el-form-item::after, .el-form-item::before, .el-form-item__content::after, .el-form-item__content::before {
            display: table;
            content: "";
        }
        .el-breadcrumb::after, .el-button-group::after, .el-form-item::after, .el-form-item__content::after {
            clear: both;
        }
        .user-setting-warp .padding-dom {
            width: 789px;
            height: 39px;
            border-bottom: 1px solid #e5e9ef;
            margin-bottom: 40px;
        }
        .user-my-btn-warp {
            float: left;
            width: 789px;
            height: 36px;
            position: relative;
        }
        .el-button, .el-checkbox-button__inner {
            -webkit-appearance: none;
            -moz-user-select: none;
            -webkit-user-select: none;
            -ms-user-select: none;
            outline: 0;
            text-align: center;
        }
        input, select, textarea {
            font-family: inherit;
            font-size: inherit;
            font-weight: inherit;
            font-size: 100%;
        }
        .el-button, .el-textarea__inner {
            font-size: 14px;
            box-sizing: border-box;
        }
        .el-button {
            display: inline-block;
            line-height: 1;
            white-space: nowrap;
            cursor: pointer;
            background: #fff;
            border: 1px solid #c4c4c4;
            color: #1f2d3d;
            margin: 0;
            padding: 10px 15px;
            border-radius: 4px;
        }
        .el-button--primary {
            color: #fff;
            background-color: #20a0ff;
            border-color: #20a0ff;
        }
        .user-my-btn .el-button--primary {
             width: 110px;
             position: absolute;
             top: 50%;
             left: 50%;
             -webkit-transform: translate(-50%, -50%);
             transform: translate(-50%, -50%);
             background: #00a1d6 !important;
         }
        .user-my-btn .el-button--primary02 {
            width: 70px;
            position: absolute;
            top: 50%;
            left: 50%;
            -webkit-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
            background: #9E3F3F !important;
        }
        .el-form-item__label {
            text-align: right;
            vertical-align: middle;
            float: left;
            font-size: 14px;
            color: #48576a;
            line-height: 1;
            padding: 11px 12px 11px 0;
            box-sizing: border-box;
        }
        .el-form-item__label {
            width: 95px;
            text-align: right;
            margin-right: 20px;
            float: left;
            line-height: 30px;
            padding: 0;
        }
        .el-date-editor {
            position: relative;
            display: inline-block;
        }
        .el-input, .el-input__inner {
            width: 100%;
            display: inline-block;
        }
        .el-input {
            position: relative;
            font-size: 14px;
        }
        .el-date-editor.el-input {
            width: 193px;
        }
        i {
            font-style: normal;
        }
        [class*=' el-icon-'], [class^=el-icon-] {
            font-family: element-icons !important;
            speak: none;
            font-style: normal;
            font-weight: 400;
            font-variant: normal;
            text-transform: none;
            line-height: 1;
            vertical-align: baseline;
            display: inline-block;
            -webkit-font-smoothing: antialiased;
            -moz-osx-font-smoothing: grayscale;
        }
        .el-input__icon {
            position: absolute;
            width: 35px;
            height: 100%;
            right: 0px;
            top: 0px;
            text-align: center;
            color: #bfcbd9;
            transition: all .3s;
        }
        .el-icon-date::before {
            content: "\E611";
        }
        .el-input__icon::after {
            content: "";
            height: 100%;
            width: 0px;
            display: inline-block;
            vertical-align: middle;
        }
        .el-input__inner {
            -webkit-appearance: none;
            -moz-appearance: none;
            appearance: none;
            background-color: #fff;
            background-image: none;
            border-radius: 4px;
            border: 1px solid #bfcbd9;
            box-sizing: border-box;
            color: #1f2d3d;
            font-size: inherit;
            height: 36px;
            line-height: 1;
            outline: 0;
            padding: 3px 10px;
            transition: border-color .2s cubic-bezier(.645, .045, .355, 1);
        }
        .el-input__icon + .el-input__inner {
            padding-right: 35px;
        }
        .user-my-date .el-input__inner {
            height: 30px;
            color: #b7b7b7;
        }
        .el-radio-button__inner, .el-radio-group, .el-radio__input {
            line-height: 1;
            vertical-align: middle;
        }
        .el-radio-group {
            display: inline-block;
            font-size: 0px;
        }
        .el-radio-button, .el-radio-button__inner {
            position: relative;
            display: inline-block;
        }
        .el-radio-button__orig-radio {
            opacity: 0;
            outline: 0;
            position: absolute;
            z-index: -1;
            left: -999px;
        }
        .el-radio-button__inner {
            white-space: nowrap;
            background: #fff;
            border: 1px solid #bfcbd9;
            border-left: 0;
            color: #1f2d3d;
            -webkit-appearance: none;
            text-align: center;
            box-sizing: border-box;
            outline: 0;
            margin: 0;
            cursor: pointer;
            transition: all .3s cubic-bezier(.645, .045, .355, 1);
            padding: 10px 15px;
            font-size: 14px;
            border-radius: 0;
        }
        .user-my-sex .el-radio-button__inner {
            margin-right: 20px;
            padding: 5px 8px;
            border: 1px solid #bfcbd9;
            border-radius: 5px !important;
            background: #f4f4f4;
            color: #717171;
        }
        :last-child.el-radio-button .el-radio-button__inner {
            border-radius: 0 4px 4px 0;
        }
        :checked.el-radio-button__orig-radio + .el-radio-button__inner {
            color: #fff;
            background-color: #20a0ff;
            border-color: #20a0ff;
            box-shadow: -1px 0px 0px 0px #20a0ff;
        }
        .user-setting-warp :checked.el-radio-button__orig-radio + .el-radio-button__inner {
            background-color: #22a1d6 !important;
            border-color: #22a1d6 !important;
        }
        :first-child.el-radio-button .el-radio-button__inner {
            border-left: 1px solid #bfcbd9;
            border-radius: 4px 0 0 4px;
            box-shadow: none !important;
        }
        .el-textarea {
            display: inline-block;
            width: 100%;
            vertical-align: bottom;
        }
        :-ms-input-placeholder.el-textarea__inner {
            color: #97a8be;
        }
        .user-my-sign .el-textarea, .user-my-sign .el-textarea .el-textarea__inner {
            float: left;
            width: 618px;
            height: 88px;
            resize: none;
        }
        .el-textarea__inner {
            display: block;
            resize: vertical;
            padding: 5px 7px;
            line-height: 1.5;
            width: 100%;
            color: #1f2d3d;
            background-color: #fff;
            background-image: none;
            border: 1px solid #bfcbd9;
            border-radius: 4px;
            transition: border-color .2s cubic-bezier(.645, .045, .355, 1);
        }
        .userinfo-username {
            font-size: 14px;
            color: #898989;
        }
        .user-nick-name .el-input, .user-nick-name .el-input__inner {
            float: left;
            width: 225px;
            height: 30px;
            margin-right: 40px;
        }
        .nick-name-not {
            color: #aaa;
        }
    </style>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/info.jpg" height="100%" width="100%"/>
</div>
<div id="app" >
    <div>
        <div class="security_content">
            <div class="security-right">
                <div class="user-setting-warp" >
                    <div>
                        <div style="float: right;">
                            <button type="button" class="btn btn-success"  onclick="window.location.href='/customer/cus_index.action'">返回</button>
                        </div>
                        <form class="el-form clearfix" mode="[object Object]">

                            <div class="el-form-item user-nick-rel-name"><label class="el-form-item__label">用户名:</label>
                                <div class="el-form-item__content"><span class="userinfo-username">${requestScope.customer.cNo}</span>
                                    <!---->
                                </div>
                            </div>
                            <div class="el-form-item user-nick-rel-name"><label class="el-form-item__label">身份证号码:</label>
                                <div class="el-form-item__content"><span class="userinfo-username">${requestScope.customer.cSfz}</span>
                                    <!---->
                                </div>
                            </div>
                            <div class="el-form-item user-nick-rel-name"><label class="el-form-item__label">姓名:</label>
                                <div class="el-form-item__content"><span class="userinfo-username">${requestScope.customer.cName}</span>
                                    <!---->
                                </div>
                            </div>
                            <div class="el-form-item user-nick-rel-name"><label class="el-form-item__label">性别:</label>
                                <div class="el-form-item__content"><span class="userinfo-username">${requestScope.customer.cSex}</span>
                                    <!---->
                                </div>
                            </div>
                            <div class="el-form-item user-nick-rel-name"><label class="el-form-item__label">联系方式:</label>
                                <div class="el-form-item__content"><span class="userinfo-username">${requestScope.customer.cTel}</span>
                                    <!---->
                                </div>
                            </div>
                            <div class="el-form-item user-nick-rel-name"><label class="el-form-item__label">收货地址:</label>
                                <div class="el-form-item__content"><span class="userinfo-username">${requestScope.customer.cAddress}</span>
                                    <!---->
                                </div>
                            </div>
                            <div class="el-form-item user-nick-rel-name"><label class="el-form-item__label">积分:</label>
                                <div class="el-form-item__content"><span class="userinfo-username">${requestScope.customer.cGrade}</span>
                                    <!---->
                                </div>
                            </div>
                            <div class="el-form-item user-my-btn">
                                <!---->
                                <div class="el-form-item__content">
                                    <div><button type="button" class="btn btn-danger" onclick="window.location.href='/customer/customer_updatepwd.action?cId=<%=session.getAttribute("userId")%>'">修改密码</button></div>
                                    <div class="user-my-btn-warp"><button class="el-button el-button--primary" onclick="window.location.href='/customer/loadInfo?cId=<%=session.getAttribute("userId")%>'" type="button">
                                        <span>编辑</span></button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
