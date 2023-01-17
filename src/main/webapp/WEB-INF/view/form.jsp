<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 17/01/2023
  Time: 09:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Exchange</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/exchange">
    <h1>Currency Exchange</h1>
    <label>
        <input type="number" placeholder="Enter USD money" name="usd">
        <input type="number" placeholder="Enter the exchange ratio" name="exchangeRatio">
        <input type="submit" value="Exchange">
    </label>
</form>

</body>
</html>
