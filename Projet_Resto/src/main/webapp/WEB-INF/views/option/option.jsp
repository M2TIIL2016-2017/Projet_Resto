<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>option Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Add a option
</h1>

<c:url var="addAction" value="/option/add" ></c:url>

<form:form action="${addAction}" commandName="option">
    <table>
        <c:if test="${!empty option.nom}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8"  disabled="true" />
                    <form:hidden path="id" />
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="nom">
                    <spring:message text="Nom"/>
                </form:label>
            </td>
            <td>
                <form:input path="nom" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="prix">
                    <spring:message text="Prix"/>
                </form:label>
            </td>
            <td>
                <form:input path="prix" />
            </td>
        </tr>
      
        <tr>
            <td colspan="2">
                <c:if test="${!empty option.nom}">
                    <input type="submit"
                           value="<spring:message text="Edit option"/>" />
                </c:if>
                <c:if test="${empty option.nom}">
                    <input type="submit"
                           value="<spring:message text="Add option"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
<h3>option List</h3>
    <table class="tg">
        <tr>
            <th width="80">option ID</th>
            <th width="120">option Name</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listOptions}" var="option">
            <tr>
                <td>${option.id}</td>
                <td>${option.nom}</td>
                <td><a href="<c:url value='/edit/${option.id}' />" >Edit</a></td>
                <td><a href="<c:url value='/remove/${option.id}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>