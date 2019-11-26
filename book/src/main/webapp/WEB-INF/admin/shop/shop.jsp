<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>积分商品</title>
    <script type="text/javascript">

        function sure () {  //确认删除意见的提示框

            if(confirm("确认删除？"))
            {
                return true;
            }
            return false;
        }
    </script>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/sky.jpg" height="100%" width="100%"/>
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
                        <a href="/admin/admin_index.action">返回</a>
                    </th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${shopList}" var="shop">
                    <tr>
                        <td>
                            <c:out value="${shop.getsId() }"/>
                        </td>
                        <td>
                            <c:out value="${shop.getsName()}"/>
                        </td>
                        <td>
                            <c:out value="${shop.getsPrice()}"/>
                        </td>
                        <td>
                            <c:out value="${shop.getsWhat()}"/>
                        </td>
                        <td>
                            <a href="shop_update.action?sId=${shop.getsId()}">修改</a>
                            &nbsp;&nbsp;&nbsp;
                            <a href="deleteShop?sId=${shop.getsId()}" onclick="return sure();">删除</a>
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
