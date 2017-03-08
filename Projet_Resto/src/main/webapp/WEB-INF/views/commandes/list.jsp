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
    Liste des commandes
</h1>

    <table class="tg">
        <tr>
            <th width="80">commande IDCommande</th>
            <th width="120">commande IDClient</th>
            <th width="120">commande date_reglement</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listCommandes}" var="commande">
            <tr>
                <td>${commande.idCommande}</td>
                <td>${commande.idClient}</td>
                <td>${commande.date_reglement}</td>
                <td><a href="<c:url value='${routes.commandeedit}/${commande.idCommande}' />" >Edit</a></td>
                <td><a href="<c:url value='${routes.commandedel}/${commande.idCommande}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>