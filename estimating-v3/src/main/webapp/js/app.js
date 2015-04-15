'use-strict'
var app = angular.module('estimatingApp', ['ui.router']);

app.config(function($stateProvider, $urlRouterProvider) {
    
    $urlRouterProvider.otherwise('/home');
    
    $stateProvider
        
        // HOME STATES AND NESTED VIEWS ========================================
        .state('usecase_cal', {
            url: '/usecase-cal',
            templateUrl: 'views/usecase_cal.html',
            controller: 'productCtrl'
        })
        
        // nested list with custom controller
        .state('function_cal', {
            url: '/function-cal',
            templateUrl: 'views/function_cal.html'           
        })
        .state('user_profile', {
            url: '/user-profile',
            templateUrl: 'views/user_profile.html'           
        })
        // nested list with just some random string data
        .state('usecase_doc', {
            url: '/usecase-doc',
            templateUrl: 'views/usecase_doc.html' 
        })
        .state('fuction_doc', {
            url: '/fuction-doc',
            templateUrl: 'views/function_doc.html' 
        })
        .state('cocomo_1_cal', {
            url: '/cocomo-1-cal',
            templateUrl: 'views/cocomo_1_cal.html' 
        })
        .state('cocomo_1_doc', {
            url: '/cocomo-1-doc',
            templateUrl: 'views/cocomo_1_doc.html' 
        })
        .state('cocomo_2_doc', {
            url: '/cocomo-2-doc',
            templateUrl: 'views/cocomo_2_doc.html' 
        })
        .state('cocomo_3_doc', {
            url: '/cocomo-3-doc',
            templateUrl: 'views/cocomo_3_doc.html' 
        })
        .state('cocomo_2_cal', {
            url: '/cocomo-2-cal',
            templateUrl: 'views/cocomo_2_cal.html' 
        })
        .state('cocomo_3_cal', {
            url: '/cocomo-3-doc',
            templateUrl: 'views/cocomo_3_cal.html' 
        })

        .state('myproject', {
            url: '/myproject',
            templateUrl: 'views/myproject.html' 
        })
        .state('share_project', {
            url: '/share_project',
            templateUrl: 'views/share_project.html' 
        })
        .state('about', {
            url: '/about',
            templateUrl: 'about.html' 
        })
       
});