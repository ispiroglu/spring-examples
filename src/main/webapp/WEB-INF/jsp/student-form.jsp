<%--
  Created by IntelliJ IDEA.
  User: ispiroglu
  Date: 3/14/22
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student form!</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName" />
        <br><br>

        Last name: <form:input path="lastName" />
        <br><br>

        <form:select path="country">
            <form:options items="${countryOptions}" />
        </form:select>
        <br><br>
        Fav Language
        <form:radiobuttons path="favouriteLanguage"
        items="${student.favouriteLanguageOptions}" />
        <br><br>
        Linux <form:checkbox path="operatingSystems" value="linux" />
        MacOS <form:checkbox path="operatingSystems" value="MacOS" />
        MS Windows <form:checkbox path="operatingSystems" value="Windwos" />

        <br><br>
        <input type="submit" value="Submit" />



    </form:form>>
</body>
</html>
