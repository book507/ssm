<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>欢迎回屋，主人</title>
        <style type="text/css">
            .button01 {
                width: 130px !important;
                height: 130px !important;
                font-size: 28px !important;
                padding-left: 0px !important;
            }
        </style>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    </head>

        <h1 style="color: gold">黄金屋</h1>


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

    <button type="button" class="btn btn-danger button01" onclick="window.location.href='/bcategory/queryBcategory'">分类管理
    </button>

</div>
<table>
    <tr valign="top">
        <div class="center-block" style="text-align: center;padding-top:10px ;">
            <button type="button" class="btn btn-primary button01" onclick="window.location.href='/shop/shop.action'">积分商城</button>
            <button type="button" class="btn btn-danger button01"
                    onclick="window.location.href='mailbox.jsp'">小屋信箱
            </button>
                       <button type="button" class="btn btn-primary button01" onclick="window.location.href='wait.jsp'">小屋打烊</button>
        </div>
    </tr>

</table>
</body>
</html>
