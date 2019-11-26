<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/17
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>小屋信箱</title>

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
    <img src="../../../images/mail.jpg" height="100%" width="100%"/>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <table class="table">
                <thead>
                <tr>

                    <th>
                        意见ID
                    </th>
                    <th>
                        用户ID
                    </th>
                    <th>
                        提议时间
                    </th>
                    <th>
                        意见内容
                    </th>
                    <th>
                        操作
                    </th>
                    <th>
                        <a href="/admin/admin_index.action">返回主页</a>
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${sugList}" var="sug">
                    <tr>
                        <td>
                            <c:out value="${sug.getSugId() }"/>
                        </td>
                        <td>
                            <c:out value="${sug.getcId()}"/>
                        </td>
                        <td>
                            <fmt:formatDate value="${sug.sugTime}" pattern="yyyy年MM月dd日 HH:mm"/>
                        </td>
                        <td>
                            <c:out value="${sug.getSugWhat()}"/>
                        </td>
                        <td>
                            <a href="deleteSug?sugId=${sug.getSugId()}"  onclick="return sure();">删除</a>
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
