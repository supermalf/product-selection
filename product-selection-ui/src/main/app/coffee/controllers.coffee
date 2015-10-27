# Product Selection - Application Controllers Module

psControllers = angular.module 'psControllers', []

psControllers.controller 'BasketController', ['$scope', 'Basket', '$routeParams', '$http'
  ($scope, Basket, $routeParams, $http) ->

    Basket.userId = $routeParams.userId
    Basket.basket = []

    $scope.basket = Basket.basket
    $scope.displayConfirm = false

    $scope.toggleSelection = (channel) ->
      $scope.displayConfirm = false
      idx = $scope.basket.indexOf(channel)

      if idx > -1
        $scope.basket.splice(idx, 1)
      else
        $scope.basket.push(channel)
    

    $http.get("http://localhost:8080/buy-channels/" + $routeParams.userId).
      success (data) ->
        $scope.channels = data
]

psControllers.controller 'ConfirmationController', ['$scope', 'Basket'
  ($scope, Basket) ->

    $scope.basket = Basket.basket
    $scope.userId = Basket.userId
]
