<%--
  Created by IntelliJ IDEA.
  User: ispiroglu
  Date: 3/16/22
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Confirmation Page</title>
</head>
<body>
    The customer is confirmed ${customer.firstName} ${customer.lastName}
    <br><br>
    Course Code: ${customer.courseCode}
    <br><br>
    PostalCode: ${customer.postalCode}
</body>
</html>
