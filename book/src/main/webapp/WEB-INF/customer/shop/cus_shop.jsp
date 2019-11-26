<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/17
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title></title>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/shop1.jpg" height="100%" width="100%"/>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <table class="table">
                <thead>
                <tr>

                    <th>
                        商品名称
                    </th>
                    <th>
                        商品价格
                    </th>
                    <th>
                        商品介绍
                    </th>

                    <th>
                        操作
                    </th>
                    <th>
                        <a href="/customer/cus_index.action">返回</a>
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${shopList}" var="shop">
                <tr>
                    <td>
                        ${shop.sName}
                    </td>
                    <td>
                        ${shop.sPrice}
                    </td>
                    <td>
                        ${shop.sWhat}
                    </td>
                    <td>
                        <a href="/shop/conversionShop?cId=${cId}&sPrice=${shop.sPrice}">兑换</a>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
