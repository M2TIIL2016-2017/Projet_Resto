<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>plat Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
    
    <!-- CSS  -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="<c:url value='/static/css/materialize.css' />" type="text/css" rel="stylesheet" media="screen,projection" />
<link href="<c:url value='/static/css/style.css' />" type="text/css" rel="stylesheet" media="screen,projection" />
</head>
<body>
<jsp:include page="../header/header.jsp" />
<c:url var="editAction" value="/plats/plat/edit" ></c:url>
<h1> Ajout plat</h1>
<form:form action="${editAction}" commandName="plat">
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
                <form:input path="nom" />
            </td>
        </tr>
        
        <tr>
            <td>
                <form:label path="detailFiche">
                    <spring:message text="detailFiche"/>
                </form:label>
            </td>
            <td>
                <form:input path="detailFiche" />
            </td>
        </tr>
        
        
      
        <tr>
            <td colspan="2">
                <c:if test="${!empty plat.nom}">
                    <input type="submit"
                           value="<spring:message text="Edit plat"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>

<h1>
    Liste des plats
</h1>

    <table class="tg">
        <tr>
            <th width="80">plat ID</th>
            <th width="120">plat Name</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listPlats}" var="plat">
            <tr>
                <td>${plat.id}</td>
                <td>${plat.nom}</td>
                <td><a href="<c:url value='${routes.platedit}/${plat.id}' />" >Edit</a></td>
                <td><a href="<c:url value='${routes.platdel}/${plat.id}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>