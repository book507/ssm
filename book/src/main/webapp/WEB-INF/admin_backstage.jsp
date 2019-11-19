<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>欢迎回屋，主人</title>
        <style type="text/css">
            .button01 {
                width: 120px !important;
                height: 120px !important;
                font-size: 28px !important;
                padding-left: 0px !important;
            }
        </style>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </head>
    <blockquote>
        <h2 style="color: gold">黄金屋</h2>
        <small style="color:gold ">欢迎回家</small>
    </blockquote>
<body background="../images/t4.jpg">
<script type="text/javascript">

    function sure () {  //确认退出登录的提示框

        if(confirm("确认退出？"))
        {
            window.location.href="/admin.jsp";
        }

    }
</script>
<div style="float: right;"><button class="btn-primary" href="#" onclick="sure()">退出登录</button></div>
<div class="center-block" style="text-align: center;padding-top:60px ;">
    <button type="button" class="btn btn-danger button01" onclick="window.location.href='book.jsp'">书籍管理</button>

    <button type="button" class="btn btn-primary button01" onclick="window.location.href='order.jsp'">订单管理</button>

    <button type="button" class="btn btn-danger button01" onclick="window.location.href='booksort.jsp'">分类管理
    </button>

</div>
<table>
    <tr valign="top">
        <div class="center-block" style="text-align: center;padding-top:10px ;">
            <button type="button" class="btn btn-primary button01" onclick="window.location.href='shop.jsp'">积分商城</button>
            <button type="button" class="btn btn-danger button01"
                    onclick="window.location.href='mailbox.jsp'">小屋信箱
            </button>
                       <button type="button" class="btn btn-primary button01" onclick="window.location.href='wait.jsp'">小屋打烊</button>
        </div>
    </tr>

</table>
</body>
</html>
