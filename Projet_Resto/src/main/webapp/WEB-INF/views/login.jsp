<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>


<!-- CSS  -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="<c:url value='/static/css/materialize.css' />" type="text/css" rel="stylesheet" media="screen,projection" />
<link href="<c:url value='/static/css/style.css' />" type="text/css" rel="stylesheet" media="screen,projection" />

</head>

<body class="grey">
	<div class="container">
		<div class="row">
			<div class="col s12 m6 offset-m3">
				<div class="card">
					<div class="card-content ">
						<span class="card-title black-text center">Connexion</span>
						<c:url var="loginUrl" value="/login" />
						<form action="${loginUrl}" method="post">
							<c:if test="${param.error != null}">
								<div class="alert alert-danger">
									<p>Invalid username and password.</p>
								</div>
							</c:if>
							<c:if test="${param.error != null}">
								<div class="alert alert-danger">
									<p>Invalid username and password.</p>
								</div>
							</c:if>
							<div class="row margin">
								<div class="input-field col s12">
									<i class="material-icons prefix">perm_identity</i>
									<input class="form-control" type="text" id="username" name="ssoId" required/>
									<label for="username">Nom d'utilisateur</label>
								</div>
							</div>
							<div class="row margin">
								<div class="input-field col s12">
									<i class="material-icons prefix">lock_outline</i>
									<input class="form-control" type="password" id="password" name="password"/>
									<label for="password">Mot de passe</label>
								</div>
							</div>
							<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
							<div class="form-actions">
								<div class="input-field col s12">
									<input type="submit" class="col s12 btn btn-large waves-effect green" value="Connexion">
								</div>
							</div>
							<div class="form-actions">
								<input type="submit" class="btn btn-block btn-primary btn-default" value="Log in">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
 <!--  Scripts-->
  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="<c:url value='/static/js/materialize.js' />"></script>
  <script type="text/javascript" src="<c:url value='/static/js/init.js' />"></script>

</body>
</html>