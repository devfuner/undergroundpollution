<%--
  Created by IntelliJ IDEA.
  User: devfu
  Date: 2018-08-08
  Time: 오후 2:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Home</title>
    <style>
        table {
            border: 1px solid orangered;
        }

        tr, td {
            border: 1px solid orangered;
        }
    </style>
</head>
<body>
    Home of ${name}

    <table>
        <c:forEach var="item" items="${list}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${item.address}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
