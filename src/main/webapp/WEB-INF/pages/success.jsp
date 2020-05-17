<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2020/5/14
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<h1>成功了</h1>
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>name</th>
        <th>sex</th>
        <th>borndate</th>
        <th>phone</th>
        <th>boyfriendId</th>
    </tr>
    <c:forEach items="${PageInfo.list}" var="beauty">
        <tr>
            <th>${beauty.id}</th>
            <th>${beauty.name}</th>
            <th>${beauty.sex}</th>
            <th>${beauty.borndate}</th>
            <th>${beauty.phone}</th>
            <th>${beauty.boyfriendId}</th>
        </tr>
    </c:forEach>
    <tr>
        <th colspan="6">
            <c:if test="${PageInfo.pageNum > 1}">
                <a href="getBeautys?pn=1">首页</a> <a href="getBeautys?pn=${PageInfo.prePage}">上一页</a>
            </c:if>
             <c:forEach items="${PageInfo.navigatepageNums}" var="num">
                 <c:if test="${num == PageInfo.pageNum}">[${num}]</c:if>
                 <c:if test="${num != PageInfo.pageNum}">
                     <a href="getBeautys?pn=${num}">${num}</a>
                 </c:if>
             </c:forEach>
            <c:if test="${PageInfo.pageNum < PageInfo.pages}">
                <a href="getBeautys?pn=${PageInfo.nextPage}">下一页</a> <a href="getBeautys?pn=${PageInfo.pages}">末页</a>
            </c:if>

        </th>
    </tr>
</table>
</body>
</html>
