<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>积分商品增加</title>
    <meta content=”text/html;charset=utf-8″ />
</head>
<body>
<h3>积分商品增加</h3>
<form action="/shop/addShop" method="post">
    <ul>
        <li style="list-style: none">商品名称:<input type="text" id="sName" name="sName" required="required"></li>
        <li style="list-style: none">商品价格:<input type="text" id="sPrice" name="sPrice" required="required"></li>
        <li style="list-style: none">商品介绍:<input type="text" id="sWhat" name="sWhat" required="required"></li>
        <li style="list-style: none">
            <input type="submit" value="提交">
            <input type="reset" value="重置">
        </li>
    </ul>
</form>
</body>
</html>
