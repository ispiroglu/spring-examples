<%--
  Created by IntelliJ IDEA.
  User: ispiroglu
  Date: 3/16/22
  Time: 12:41 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Registration Form</title>

    <style>
        .error{color:red}
    </style>
</head>
<body>

<i> Fill out the form. Asteriks (*) means Required </i>
    <form:form action="processForm" modelAttribute="customer">
        First Name: <form:input path="firstName" /> <!--This will call setFirstName() -->
        <br><br>
        Last Name*: <form:input path="lastName" /> <!-- This will clal setLastName()-->
        <form:errors path="lastName" cssClass="error" />
        <br><br>
        Free Passes: <form:input path="freePasses" />
        <form:errors path="freePasses" cssClass="error" />
        <br><br>
        Course Code: <form:input path="courseCode" />
        <form:errors path="courseCode" cssClass="error" />
        <br><br>
        Postal Code: <form:input path="postalCode" />
        <form:errors path="postalCode" cssClass="error" />
        <br><br>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
