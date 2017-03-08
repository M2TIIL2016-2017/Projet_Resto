<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
  <title>Restaurant NOM</title>

  <!-- CSS  -->
   		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  		<link href="<c:url value='/static/css/materialize.css' />"   type="text/css" rel="stylesheet" media="screen,projection"/>
		<link href="<c:url value='/static/css/style.css' />" type="text/css" rel="stylesheet" media="screen,projection"/>
	
 
</head>
<body>
<jsp:include page="../header/header.jsp" />
<%--   <nav class="white" role="navigation">
    <div class="nav-wrapper container">
      <a id="logo-container" href="#" class="brand-logo">Logo</a>
      <ul class="right hide-on-med-and-down">
        <li><a href="#">Accueil</a></li>
        <li><a href="#">Notre Carte</a></li>
        <li><a href="#">Livraison</a></li>
         <li><a href="#"> ${loggedinuser} </a></li>
        
      </ul>

	<!-- Barre de menu sur l'application mobile -->
      <ul id="nav-mobile" class="side-nav">
        <li><a href="#">Accueil</a></li>
        <li><a href="#">Notre Carte</a></li>
        <li><a href="#">Livraison</a></li>
      </ul>
      <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
    </div>
  </nav> --%>

  <div id="index-banner" class="parallax-container">
    <div class="section no-pad-bot">
      <div class="container">
        <br><br>
        <h1 class="header center teal-text text-lighten-2">DauBurger</h1>
        <div class="row center">
          <h5 class="header col s12 light">Maison du Hamburger depuis 20 ans. </br> Bas� à Brest, vous ne commanderez pas chez nous par hasard!</h5>
        </div>
        <div class="row center">
          <a href="http://materializecss.com/getting-started.html" id="download-button" class="btn-large waves-effect waves-light teal lighten-1">Commander</a>
        </div>
        <br><br>

      </div>
    </div>
    <div class="parallax"><img src="<c:url value='/static/images/burger_first_image.jpg' />" alt="Unsplashed background img 1"></div>
  </div>


  <div class="container">
    <div class="section">

      <!--   Icon Section   -->
      <div class="row">
        <div class="col s12 m4">
          <div class="icon-block">
            <h2 class="center brown-text"><i class="material-icons">flash_on</i></h2>
            <h5 class="center">Livraison</h5>

            <p class="light">Votre commande prête en moins de 15 minutes ! Livraison r�alis� en moins de 30 minutes chrono à partir du moment votre commande est pass�e. </p>
          </div>
        </div>

        <div class="col s12 m4">
          <div class="icon-block">
            <h2 class="center brown-text"><i class="material-icons">group</i></h2>
            <h5 class="center">Une �quipe à votre �coute</h5>

            <p class="light">Nous vous promettons des produits frais et de qualit�. Car votre satisfactions sera notre plus grande r�ussite.</p>
          </div>
        </div>

        <div class="col s12 m4">
          <div class="icon-block">
            <h2 class="center brown-text"><i class="material-icons">settings</i></h2>
            <h5 class="center">Commande facile</h5>

            <p class="light">Vous n'aurez jamais pass� une commande aussi facilement et rapidement.</p>
          </div>
        </div>
      </div>
    </div>
  </div>


  <div class="parallax-container valign-wrapper">
    <div class="section no-pad-bot">
      <div class="container">
        <div class="row center">
          <h5 class="header col s12 light">Commander chez nous, c'est nous adopter !</h5>
        </div>
      </div>
    </div>
    <div class="parallax"><img src="<c:url value='/static/images/cheese_turtle_burger.jpg' />" alt="Unsplashed background img 2"></div>
  </div>

  <div class="container">
    <div class="section">

      <div class="row">
        <div class="col s12 center">
          <h3><i class="mdi-content-send brown-text"></i></h3>
          <h4>Nous contacter</h4>
          <p class="left-align light">A definir</p>
        </div>
      </div>

    </div>
  </div>

  <footer class="page-footer teal">
    <div class="container">
      <div class="row">
        <div class="col l6 s12">
          <h5 class="white-text">DaubTEAM</h5>
          <p class="grey-text text-lighten-4">Nous sommes une �quipe d'�tudiant qui avons r�alis� ce projet dans l'optique d'un UE dans le cadre de notre formation de MASTER Technologie de l'Information et Ing�nierie Logiciel.</p>


        </div>
        <div class="col l3 s12">
          <h5 class="white-text">A definir</h5>
          <ul>
            <li><a class="white-text" href="#!">Lien</a></li>

          </ul>
        </div>
        <div class="col l3 s12">
          <h5 class="white-text">A definir</h5>
          <ul>
            <li><a class="white-text" href="#!">Lien</a></li>

          </ul>
        </div>
      </div>
    </div>
    <div class="footer-copyright">
      <div class="container">
      Site r�alis� par <a class="brown-text text-lighten-3" href="google.com">A. GOMEZ - J. LEVESQUE - C. MARREC</a>
      </div>
    </div>
  </footer>


  <!--  Scripts-->
  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="<c:url value='/static/js/materialize.js' />"></script>
  <script type="text/javascript" src="<c:url value='/static/js/init.js' />"></script>

  </body>
</html>
