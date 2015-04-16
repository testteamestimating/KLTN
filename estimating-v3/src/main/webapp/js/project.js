app.controller('projectCtrl', function($scope, $rootScope, $http) {
	
	// Find all Project
	/*$scope.projects = function(){
		$http({
		    'url' : 'project/findall',
		    'method' : 'GET',
		    'headers': {'Content-Type' : 'application/json'}
		}).success(function(data){
			alert("Success");
		})
	}*/
	
	// Declare variables
	$scope.projects;
	$scope.projectTypes;
	$scope.project;
	$scope.projectType;
	
	if($scope.projects == null && $scope.projectTypes == null) {
		$http.get("project/findall")
		.success(function(response) {
			$scope.projects = response["projects"];
			$scope.projectTypes = response["projectTypes"];
		}).error(function(){
			throw new Error("Can't find the object");
	    });
	};
	
	$scope.addNewProject = function() {
		var url = "project/add";
		var requestObject = $scope.initProjectObject();
		$http.post(url, requestObject).
		success(function(response) {
			alert("OK");
		}).
		error(function() {
		});
	};
	
	$scope.initProjectObject = function() {
		var object = {
			"projectName" : $scope.projectName,
			"description" : $scope.description,
			"projectTypeId": $scope.projectTypeId
		};
		return object;
	};
});