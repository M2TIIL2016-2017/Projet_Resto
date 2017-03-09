<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Mon compte</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	${loggedinuser}
	<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-6">
					<form role="form">
						<div class="form-group">
							 
							<label for="exampleInputEmail1">
								Email<button class="btn btn-default" type="submit">
							Supprimer mon compte
						</button>
							</label>
							<input class="form-control" id="exampleInputEmail1" readonly="readonly" value="${loggedinuser.email}" type="email" />
						
							</div>
						<div class="form-group">
							 
							<label for="exampleInputEmail1">
								Nom
							</label>
							<input class="form-control" id="exampleInputEmail1" type="email" />
						</div>
						<div class="form-group">
							 
							<label for="exampleInputEmail1">
								Prénom
							</label>
							<input class="form-control" id="exampleInputEmail1" type="email" />
						</div>
						
						<div class="form-group">
							 
							<label for="exampleInputEmail1">
								Téléphone
							</label>
							<input class="form-control" id="exampleInputEmail1" type="email" />
						</div>
						
					</form> 
					<button class="btn btn-default" type="button">
						Précedent
					</button>
				</div>
				<div class="col-md-6">
					<h3>
						Carte(s) sauvegardée(s)
					</h3>
					<p>
						Pour ajouter / modifier une carte de paiement, passez une commande en ligne et choisissez « Carte sauvegardée » sur la page de paiement.	</p>
					<h3>
						Adresse(s) sauvegardée(s)
					</h3>
					<p>
						Pour ajouter une nouvelle adresse, passez une commande en ligne en utilisant cette adresse et elle sera sauvegardée sur votre compte. </p>
					<p>
						En supprimant cette adresse de livraison, vous ne pourrez plus profiter de la commande en 5 clics. </p> 
					<button class="btn btn-default" type="button">
						Sauvegarder
					</button>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>