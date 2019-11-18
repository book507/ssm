<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <script type="text/javascript">
        /*提示是否退出登录*/
        function logOutTip(){
            var c=confirm(<%=session.getAttribute("username")%>+"确定要开吗?");
            if(c){
                window.location.reload();
        }else {
                alert("已取消");
            }
        }
    </script>
</head>
<body>

第<%=session.getAttribute("userId")%>号,<%=session.getAttribute("username")%>&nbsp;登录成功&nbsp;&nbsp;&nbsp;&nbsp;<a href="/customer/lookInfo?cId=<%=session.getAttribute("userId")%>">个人中心</a>&nbsp;&nbsp;&nbsp;&nbsp;<a  href="/customer/logout" onclick="logOutTip()">退出登录</a>
</body>
</html>
