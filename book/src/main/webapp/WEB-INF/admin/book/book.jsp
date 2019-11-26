<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/17
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>书籍信息</title>
    <script type="text/javascript">

        function sure () {

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
    <img src="../../../images/book1.jpg" height="100%" width="100%"/>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <table class="table">
                <thead>
                <tr>

                    <th>
                        书籍ID
                    </th>
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
                        <a href="/book/book_add.action">添加书籍</a>
                    </th>
                    <th>
                        <a href="/admin/admin_index.action">返回主页</a>
                    </th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${mapList}" var="map">

                    <tr>
                        <td>
                            ${map.bookId}
                        </td>
                        <td>
                            ${map.bookName}
                        </td>
                        <td>
                            ${map.bookPrice}
                        </td>
                        <td>
                            ${map.bookWhat}
                        </td>
                        <td>
                            ${map.booksort.bsName}
                        </td>

                        <td>
                            <a href="book_update.action?bookId=${map.bookId}">修改</a>
                            &nbsp;&nbsp;&nbsp;
                            <a href="/book/deleteBook?bookId=${map.bookId}" onclick="return sure();">删除</a>
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
