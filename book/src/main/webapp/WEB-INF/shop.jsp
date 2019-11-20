<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>积分商品增加</title>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../images/sky.jpg" height="100%" width="100%"/>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <table class="table">
                <thead>
                <tr>

                    <th>
                        商品ID
                    </th>
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
                        <a href="/shop/shop_add.action">添加商品</a>
                    </th>
                    <th>
                        <a href="/shop/shop.action">返回</a>
                    </th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${bookfl}" var="book">
                    <tr>
                        <td>
                            <c:out value="${book.getBsId() }"/>
                        </td>
                        <td>
                            <c:out value="${book.getBsName()}"/>
                        </td>
                        <td>
                            <c:out value="${book.getBsWhat()}"/>
                        </td>
                        <td>
                            <a href="bcategory_update.action?bs_id=${book.getBsId()}">修改</a>
                            &nbsp;&nbsp;&nbsp;
                            <a href="deleteBcategory?bs_id=${book.getBsId()}">删除</a>
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
