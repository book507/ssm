<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/17
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改书籍信息</title>
</head>
<script type="text/javascript">
    function yz(){
        if(document.form.bookPrice.value==""){
            alert("书籍价格不能为空！");
            return false;}
        if(document.form.bookWhat.value==""){
            alert("请编辑书籍介绍！");
            return false;}
    }
</script>

<style>
    .basic-grey {
        margin-left:auto;
        margin-right:auto;
        max-width: 500px;
        background: #F7F7F7;
        padding: 25px 15px 25px 10px;
        font: 12px Georgia, "Times New Roman", Times, serif;
        color: #888;
        text-shadow: 1px 1px 1px #FFF;
        border:1px solid #E4E4E4;
    }
    .basic-grey h1 {
        font-size: 25px;
        padding: 0px 0px 10px 40px;
        display: block;
        border-bottom:1px solid #E4E4E4;
        margin: -10px -15px 30px -10px;;
        color: #888;
    }
    .basic-grey h1>span {
        display: block;
        font-size: 11px;
    }
    .basic-grey label {
        display: block;
        margin: 0px;
    }
    .basic-grey label>span {
        float: left;
        width: 20%;
        text-align: right;
        padding-right: 10px;
        margin-top: 10px;
        color: #888;
    }
    .basic-grey input[type="text"], .basic-grey input[type="email"], .basic-grey textarea, .basic-grey select {
        border: 1px solid #DADADA;
        color: #888;
        height: 30px;
        margin-bottom: 16px;
        margin-right: 6px;
        margin-top: 2px;
        outline: 0 none;
        padding: 3px 3px 3px 5px;
        width: 70%;
        font-size: 12px;
        line-height:15px;
        box-shadow: inset 0px 1px 4px #ECECEC;
        -moz-box-shadow: inset 0px 1px 4px #ECECEC;
        -webkit-box-shadow: inset 0px 1px 4px #ECECEC;
    }
    .basic-grey textarea{
        padding: 5px 3px 3px 5px;
    }
    .basic-grey textarea{
        height:100px;
    }
    .basic-grey .button {
        background: #E27575;
        border: none;
        padding: 10px 25px 10px 25px;
        color: #FFF;
        box-shadow: 1px 1px 5px #B6B6B6;
        border-radius: 3px;
        text-shadow: 1px 1px 1px #9E3F3F;
        cursor: pointer;
    }
    .basic-grey .button:hover {
        background: #CF7A7A
    }
</style>
<body style="background: url(../../../images/t5.jpg) ; background-size:100% 100% ; background-attachment: fixed">

<form name="form" action="/book/updateBook" method="post" class="basic-grey">
    <h1 align="center">修改书籍分类
    </h1>
    <p align="center"><input  type="hidden" name="bookId" value="${book.bookId}" style="display: none" />
        书名  ：<input id="bookName" type="text" name="bookName" readonly="readonly" value="${book.bookName}"  />
    </p>

    <p align="center">

        价格：<input id="bookPrice" type="text" name="bookPrice" value="${book.bookPrice}"  />
    </p>
    <p align="center">

        介绍：<input id="bookWhat" type="text" name="bookWhat" value="${book.bookWhat}"  />
    </p>

    <p align="center">
        <c:choose>
            <c:when test="${requestScope.booksortList==null}">
                <span style="color:#FF0000">加载书籍分类数据失败</span>
            </c:when>
            <c:when test="${empty requestScope.booksortList}">
                <span style="color:#FF0000">未加载到书籍分类数据</span>
            </c:when>
            <c:otherwise>分类：
                <select name="bsId"  >
                    <c:forEach items="${requestScope.booksortList}" var="booksort">
                        <option value="${booksort.bsId}" ${booksort.bsId == book.bsId?"selected":""}> ${booksort.bsName} </option>
                    </c:forEach>
                </select>
            </c:otherwise>
        </c:choose>
    </p>

    <p align="center">
        <input type="submit" class="button" value="确认修改" onclick="yz"/>
    </p>
</form>
</body>
</html>
