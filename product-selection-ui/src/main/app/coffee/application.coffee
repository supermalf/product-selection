# Product Selection - Angular application module

psApp = angular.module 'psApp', ['psControllers', 'psServices', 'ngRoute']

psApp.config ['$routeProvider',
  ($routeProvider) ->
    $routeProvider
    .when '/product_selection',
      templateUrl: 'assets/app/partials/nouser.html'
    .when '/product_selection/:userId',
      templateUrl: 'assets/app/partials/main.html'
      controller: 'BasketController'
    .when '/confirmation',
      templateUrl: 'assets/app/partials/confirmation.html'
      controller: 'ConfirmationController'
    .otherwise
      redirectTo: '/product_selection'
]
