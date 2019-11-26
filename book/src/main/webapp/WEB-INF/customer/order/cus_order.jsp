<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/17
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>我的订单</title>
    <script type="text/javascript">

        function sure () {

            var osta = document.getElementById("oSta").value;
            if(confirm("确认申请退款？"))
            {
                return true;
            }
            if(osta==3){
                alert("该订单已受理");
                return false;
            }
            return false;
        }
    </script>

</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../../../images/order1.jpg" height="100%" width="100%"/>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <table class="table">
                <thead>
                <tr>

                    <th>
                        订单编号
                    </th>
                    <th>
                        书籍名
                    </th>
                    <th>
                        订单状态
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
                <c:forEach items="${mapList}" var="map">
                <tr>
                    <td>
                        ${map.oNo}
                    </td>
                    <td>
                        ${map.book.bookName}
                    </td>
                    <td>
                        ${map.oSta==0?'待发货':map.oSta==1?'已发货':map.oSta==2?'交易成功':map.oSta==3?'已受理':'未受理'}
                    </td>
                    <td><input  type="hidden" name="oSta" value="${map.oSta}" style="display: none" />
                        <a href="/order/updateOrderOfUser?oId=${map.oId}&oSta=${map.oSta}" onclick="return sure();">申请退款</a>
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