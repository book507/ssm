<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/17
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>订单管理</title>
    <script type="text/javascript">

        function sure () {  //确认删除提示框

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
    <img src="../images/order1.jpg" height="100%" width="100%"/>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <table class="table">
                <thead>
                <tr>

                    <th>
                        订单ID
                    </th>
                    <th>
                        订单编号
                    </th>
                    <th>
                        用户ID
                    </th>
                    <th>
                        书籍ID
                    </th>
                    <th>
                        订单状态
                    </th>
                    <th>
                        操作
                    </th>
                    <th>
                        <a href="/admin/admin_backstage.action">返回主页</a>
                    </th>
                </tr>
                </thead>
                <tbody>
                    <c:forEach items="${orderList}" var="order">
                        <tr>
                            <td>
                                <c:out value="${order.getoId() }"/>
                            </td>
                            <td>
                                <c:out value="${order.getoNo()}"/>
                            </td>
                            <td>
                                <c:out value="${order.getcId()}"/>
                            </td>
                            <td>
                                <c:out value="${order.getbId()}"/>
                            </td>
                            <td>
                                <c:out value="${order.getoSta()}"/>
                            </td>
                            <td>
                                <a href="order_update.action?bs_id=${order.getoId()}">修改</a>
                                &nbsp;&nbsp;&nbsp;
                                <a href="deleteOrder?sugId=${order.getoId()}"  onclick="sure();">删除</a>
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
