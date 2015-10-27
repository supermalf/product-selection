# Product Selection - Application Services Module

psServices = angular.module 'psServices', ['ngResource']

psServices.factory 'Basket', () ->
  userId : 'undefined'
  basket : []
