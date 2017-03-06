<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>DauBurger</title>
<!-- 	<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="../bootstrap/css/signin.css" rel="stylesheet">
	<link href="../bootstrap/css/styles.css" rel="stylesheet"> -->

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="<c:url value='/static/css/materialize.css' />" type="text/css" rel="stylesheet" media="screen,projection" />
<link href="<c:url value='/static/css/style.css' />" type="text/css" rel="stylesheet" media="screen,projection" />
</head>
<body>

	<nav class="white" role="navigation">
		<div class="nav-wrapper container">
			<a id="logo-container" href="#" class="brand-logo">Logo</a>
			<ul class="right hide-on-med-and-down">
				<li><a href="#">Accueil</a></li>
				<li><a href="#">Notre Carte</a></li>
				<li><a href="#">Livraison</a></li>
				<li><a href="<c:url value='identification/login.jsp' />">Connexion</a></li>
				<li><a href="#"> ${loggedinuser} </a></li>

			</ul>

			<!-- Barre de menu sur l'application mobile -->
			<ul id="nav-mobile" class="side-nav">
				<li><a href="#">Accueil</a></li>
				<li><a href="#">Notre Carte</a></li>
				<li><a href="#">Livraison</a></li>
				<li><a href="../identification/login.jsp">Connexion</a></li>
				<li><a href="#"> ${loggedinuser} </a></li>
			</ul>
			<a href="#" data-activates="nav-mobile" class="button-collapse"><i
				class="material-icons">menu</i></a>
		</div>
	</nav>
	<%-- 	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="../accueil/accueil.jsp">Brest 2016</a>						
				
				<c:choose>
					<c:when test="${manager.admin && manager.identifie}">
						<a class="navbar-brand" href="../admin/animations.jsp">Admin</a>
						<a class="navbar-brand" href="../admin/ajoutAnimation.jsp">Ajout ani</a>
						<a class="navbar-brand" href="../admin/ajoutGroupe.jsp">Ajout gro</a>
						<a class="navbar-brand" href="../identification/deconnexion.jsp">Déconnexion</a>
					</c:when>
					<c:when test="${!manager.admin && manager.identifie}">
						<a class="navbar-brand" href="../reservation/mesReservations.jsp">Réservations</a>
						<a class="navbar-brand" href="../identification/deconnexion.jsp">Déconnexion</a>
					</c:when>
					<c:otherwise>
					  <a class="navbar-brand" href="../identification/login.jsp">Connexion</a>
					</c:otherwise>
				</c:choose>
				
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav> --%>