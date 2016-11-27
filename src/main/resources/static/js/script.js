/**
 * Created by Nagendra on 26-11-2016.
 */

var MainController = function($scope, $http) {

    var promise = $http.get("http://localhost:8080/getJSON");
    promise.then(function (response) {
        $scope.gitHubUserData = response.data;
    })

    var person = {
        firstName: "Nagendra"
    };
    $scope.person = person;
    $scope.message = "Hello Angular!";
};


angular.module('mainApp', [])
    .controller('MainController', MainController);

