app.controller('productCtrl', function($scope, $rootScope, $http) {
	
	// Find all Project
	/*$scope.projects = function(){
		$http({
		    'url' : '/project/findall',
		    'method' : 'GET',
		    'headers': {'Content-Type' : 'application/json'}
		}).success(function(data){
			alert("Success");
		})
	}*/
	$http.get("project/findall")
	.success(function(response) {
		$scope.projects = response;
	});
});