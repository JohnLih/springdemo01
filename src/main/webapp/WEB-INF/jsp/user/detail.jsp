<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 引入jstl -->
<%@include file="../common/tag.jsp"%>
<html>
<head>
    <title>用户信息</title>
    <%@include file="../common/head.jsp"%>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h2>用户信息</h2>
        </div>
        <div class="panel-body">
            <ul class="unstyled">
                <li class="unstyled">
                    <h4>用户 : ${user.name}</h4>
                </li>
                <li class="unstyled">
                    <h4>创建时间 :
                        <fmt:formatDate value="${user.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                    </h4>
                </li>
                <c:forEach var="pr" items="${user.properties}">
                    <li class="unstyled">
                        <h4>${pr.name} : ${pr.value}</h4>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
</body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</html>
