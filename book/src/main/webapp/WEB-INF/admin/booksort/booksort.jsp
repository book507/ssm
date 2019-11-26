<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>书籍分类</title>
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
                        书籍分类ID
                    </th>
                    <th>
                        书籍分类名
                    </th>
                    <th>
                        书籍分类说明
                    </th>
                    <th>
                        操作
                    </th>
                    <th>
                        <a href="/booksort/booksort_add.action">添加书籍分类</a>
                    </th>
                    <th>
                        <a href="/admin/admin_index.action">返回主页</a>
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
                            <a href="booksort_update.action?bs_id=${book.getBsId()}">修改</a>
                            &nbsp;&nbsp;&nbsp;
                            <a href="deleteBooksort?bs_id=${book.getBsId()} " onclick="return sure();">删除</a>
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
