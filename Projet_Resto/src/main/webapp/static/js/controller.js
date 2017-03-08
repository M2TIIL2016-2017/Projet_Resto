/**
 * 
 */

var app = angular.module("front", []);

app.controller('ConnectionController', function($scope, $http, rootScope){
	$scope.visiteur = {};
	
	// Valeur par default
	$scope.connected = false;
	
	// Fonction de connexion
	$scope.identification = function() {
		$http({
			method : 'POST',
			url : '',
			header : {
				'Content-Type' : 'application/json'
			},
			data : $scope.visiteur
		}).success(function(data) {
			if(checkErrors(data)) {
				showMessage("Connexion réussie ! ");
				$scope.connected = data.connected;
				$scope.nom = data.user.prenom + ' ' + data.user.nom;
				$rootScope.$emit("refreshProfil", {});
			}
		}).error(function(data) {
			showError("Impossible de vous connecter.");
		})
	}
});