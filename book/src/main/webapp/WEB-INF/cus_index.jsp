<%--
  Created by IntelliJ IDEA.
  User: ZZL
  Date: 2019/11/17
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../css/public.css"/>
    <link rel="stylesheet" href="../css/index.css"/>
    <link rel="stylesheet" href="../css/swiper3.07.min.css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Golden house</title>
</head>
<body>
<script type="text/javascript">

    function sure () {  //确认退出登录的提示框

        var c=confirm(<%=session.getAttribute("username")%>+"确定要离开吗?");
        if(c){
            window.location.reload();
        }else {
            alert("已取消");
        }
    }
</script>
<div class="top" id="item4">
    <div class="container clearfix">
        <ul class="clearfix fr">
            第<%=session.getAttribute("userId")%>号&nbsp;
            <%=session.getAttribute("username")%>
            <a href="/customer/lookInfo?cId=<%=session.getAttribute("userId")%>">个人中心</a></li>
            <li><a href="/favorite/queryBook?cId=<%=session.getAttribute("userId")%>">收藏夹</a></li>
            <li><a href="cus_gwc.jsp">购物车</a></li>
            <li><a href="/shop/queryAll">积分商城</a></li>
            <li><a href="cus_order.jsp">我的订单</a></li>
            <li><a href="/sug/cus_sug.action">意见反馈</a></li>
            <a href="#" onclick="sure()">退出登录</a>
        </ul>
    </div>
</div>

<div class="header">
    <div class="container clearfix">
        <div class="logo fl">
            <a href="#"><img src="../images/logohjw.jpg" alt=""/></a>
        </div>
        <div class="seacher fl">
            <form action="" method="post">
                <input type="text" placeholder="千里之行,始于足下"/><input type="submit" value="搜 索"/>
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
                        <tr>
                            <td>
                                1
                            </td>
                            <td>
                                诗文词曲
                            </td>
                            <td>
                                艺术瑰宝
                            </td>
                            <td>
                                <a href="cus_book.jsp">进入</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                2
                            </td>
                            <td>
                                武侠玄幻
                            </td>
                            <td>
                                飞雪连天射白鹿
                            </td>
                            <td>
                                <a href="book05.html">进入</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                3
                            </td>
                            <td>
                                名家随笔
                            </td>
                            <td>
                                论胡适对打牌的执着
                            </td>
                            <td>
                                <a href="book05.html">进入</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                4
                            </td>
                            <td>
                                推理悬疑
                            </td>
                            <td>
                                福尔摩斯在等你
                            </td>
                            <td>
                                <a href="book05.html">进入</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                5
                            </td>
                            <td>
                                学习资料
                            </td>
                            <td>
                                学习使我快乐
                            </td>
                            <td>
                                <a href="book05.html">进入</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                6
                            </td>
                            <td>
                                文坛名著
                            </td>
                            <td>
                                书籍是人类进步的阶梯
                            </td>
                            <td>
                                <a href="cus_book.jsp">进入</a>
                            </td>
                        </tr>
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