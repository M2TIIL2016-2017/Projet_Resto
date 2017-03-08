<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>commande Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Add a commande
</h1>

<c:url var="addAction" value="/commande/add" ></c:url>

<form:form action="${addAction}" commandName="commande">
    <table>
        <c:if test="${!empty commande.nom}">
            <tr>
                <td>
                    <form:label path="idCommande">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="idCommande" readonly="true" size="8"  disabled="true" />
                    <form:hidden path="idCommande" />
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="idClient">
                    <spring:message text="idClient"/>
                </form:label>
            </td>
            <td>
				<form:input path="idClient" readonly="true" size="8"  disabled="true" />
				<form:hidden path="idClient" />
            </td>
        </tr>
        
         <tr>
            <td>
                <form:label path="date_reglement">
                    <spring:message text="date_reglement"/>
                </form:label>
            </td>
            <td>
                <form:input path="date_reglement" />
            </td>
        </tr>
      
        <tr>
            <td colspan="2">
                <c:if test="${!empty commande.nom}">
                    <input type="submit"
                           value="<spring:message text="Edit commande"/>" />
                </c:if>
                <c:if test="${empty commande.nom}">
                    <input type="submit"
                           value="<spring:message text="Add commande"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
<h3>commande List</h3>
    <table class="tg">
        <tr>
            <th width="80">commande ID</th>
            <th width="120">commande Name</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listCommandes}" var="commande">
            <tr>
                <td>${commande.idCommande}</td>
                <td>${cuisson.idClient}</td>
                <td>${cuisson.dateReglement}</td>
                <td><a href="<c:url value='/edit/${commande.idCommande}' />" >Edit</a></td>
                <td><a href="<c:url value='/remove/${commande.idCommande}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>