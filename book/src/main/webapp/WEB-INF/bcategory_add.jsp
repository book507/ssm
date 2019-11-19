<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>图书分类增加</title>
    <meta content=”text/html;charset=utf-8″ />
</head>
<body>
<h3>图书分类增加</h3>
<form action="/bcategory/addBcategory" method="post">
    <ul>
        <li style="list-style: none">书籍分类名:<input type="text" id="bsName" name="bsName"></li>
        <li style="list-style: none">分类说明:<input type="text" id="bsWhat" name="bsWhat"></li>
        <li style="list-style: none">
            <input type="submit" value="提交">
            <input type="reset" value="重置">
        </li>
    </ul>
</form>
</body>
</html>
