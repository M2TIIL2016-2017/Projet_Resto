<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Ajouter un plat</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Add a plat
</h1>

<c:url var="editAction" value="${routes.platedit}
**4" ></c:url>

<form:form action="${addAction}" commandName="plat">
    <table>
        <c:if test="${!empty plat.nom}">
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
                <form:input path="nom" value="${plat.nom}"/>
            </td>
        </tr>
        
        <tr>
            <td>
                <form:label path="detailFiche">
                    <spring:message text="detailFiche"/>
                </form:label>
            </td>
            <td>
                <form:input path="detailFiche" value="${plat.detailFiche}"/>
            </td>
        </tr>
        
        
      
        <tr>
            <td colspan="2">
                <c:if test="${!empty plat.nom}">
                    <input type="submit"
                           value="<spring:message text="Edit plat"/>" />
                </c:if>
                <c:if test="${empty plat.nom}">
                    <input type="submit"
                           value="<spring:message text="Add plat"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
</body>
</html>