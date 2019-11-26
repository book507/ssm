
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../css/public.css"/>
    <link rel="stylesheet" href="../../css/index.css"/>
    <link rel="stylesheet" href="../../css/swiper3.07.min.css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Golden house</title>
</head>
<body>
<script type="text/javascript">

    function sure () {  //确认退出登录的提示框

        if(confirm("确认退出？"))
        {
            window.location.href="/index.jsp";

        }
        else{
            window.location.reload();
        }
    }
</script>
<div class="top" id="item4">
    <div class="container clearfix">
        <ul class="clearfix fr">

            <li style="color: #e22b41">欢迎<%=session.getAttribute("username")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
           <li><a href="/customer/lookInfo?cId=<%=session.getAttribute("userId")%>">个人中心</a></li>
            <li><a href="/favorite/queryBook?cId=<%=session.getAttribute("userId")%>">收藏夹</a></li>
            <li><a href="/cart/queryBook?cId=<%=session.getAttribute("userId")%>">购物车</a></li>
            <li><a href="/shop/queryAll?cId=<%=session.getAttribute("userId")%>">积分商城</a></li>
            <li><a href="/order/queryOrderOfCus?cId=<%=session.getAttribute("userId")%>">我的订单</a></li>
            <li><a href="/sug/cus_sug.action?cId=<%=session.getAttribute("userId")%>">意见反馈</a></li>
            <a href="#" onclick="sure()">退出登录</a>


        </ul>
    </div>
</div>

<div class="header">
    <div class="container clearfix">
        <div class="logo fl">
            <a href="#"><img src="../../images/logohjw.jpg" alt=""/></a>
        </div>
        <div class="seacher fl">
            <form name="from" action="/book/keyword" method="post" >
                <input type="text" name="keyword" placeholder="千里之行,始于足下"/><input type="submit" value="搜 索"/>
            </form>
            <p>热门搜索：<a href="#">平凡的世界</a> &nbsp;&nbsp;<a href="#">百年孤独</a> &nbsp;&nbsp;<a href="#">愿生命从容</a>&nbsp;&nbsp; <a href="#">四级高频词典</a> &nbsp;&nbsp;<a href="#">斗破苍穹</a></p>
        </div>
    </div>
</div>

<div class="mian container">


    <div class="jiaocai clearfix" id="item1">
        <h1>书籍分类<span></span></h1>
        <div class="list fl">

        </div>


        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span12">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>
                                分类编号
                            </th>
                            <th>
                                分类名
                            </th>
                            <th>
                                分类说明
                            </th>
                            <th>
                                操作
                            </th>

                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach items="${booksortList}" var="booksort">
                        <tr>
                            <td>
                                <c:out value="${booksort.getBsId() }"/>
                            </td>
                            <td>
                                <c:out value="${booksort.getBsName()}"/>
                            </td>
                            <td>
                                <c:out value="${booksort.getBsWhat()}"/>
                            </td>
                            <td>
                                <a href="/book/queryBookOfBooksort?cId=<%=session.getAttribute("userId")%>&bsId=${booksort.getBsId()}">进入</a>
                            </td>
                        </tr>
                        </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>







</div>
<div class="foot">
    <div class="container">

        <div class="line"></div>

        <div class="bottom">
            <p>合作店铺：<a href="http://www.dangdang.com">当当</a>&nbsp;&nbsp;<a href="http://www.jd.com">京东</a>&nbsp;&nbsp;<a href="http://www.taobao.com">淘宝</a></p>
            <p>店小客多，如招待不周，还望海涵</p>
            <p>技术支持：QST-507技术组 &nbsp;&nbsp;商务QQ:269792066 &nbsp;&nbsp;邮箱：stream657@foxmail.com</p>
        </div>
    </div>
</div>
</body>
</html>