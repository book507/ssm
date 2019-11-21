<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/17
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title></title>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../images/book1.jpg" height="100%" width="100%"/>
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
                        <a href="#">添加书籍</a>
                    </th>
                    <th>
                        <a href="/admin/admin_backstage.action">返回主页</a>
                    </th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>
                        101
                    </td>
                    <td>
                        傲慢与偏见
                    </td>
                    <td>
                        35
                    </td>
                    <td>
                        ZZL强推
                    </td>
                    <td>
                        文艺复兴
                    </td>
                    <td>
                        <a href="#">修改</a>
                        &nbsp;&nbsp;&nbsp;
                        <a href="#">删除</a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
