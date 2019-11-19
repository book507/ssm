<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/17
  Time: 21:03
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
    <img src="images/fav.jpg" height="100%" width="100%"/>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <table class="table">
                <thead>
                <tr>

                    <th>
                        书籍名
                    </th>
                    <th>
                        书籍价格
                    </th>
                    <th>
                        书籍介绍
                    </th>
                    <th>
                        书籍分类
                    </th>
                    <th>
                        操作
                    </th>
                    <th>
                        <a href="cus_index.jsp">返回</a>
                    </th>
                </tr>
                </thead>
                <tbody>
                ${favoriteList}
                <c:forEach items="${favoriteList}" var="favorite">
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
                            <a href="wait.html">修改</a>
                            &nbsp;&nbsp;&nbsp;
                            <a href="wait.html">删除</a>
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
