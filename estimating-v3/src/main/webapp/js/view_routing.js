var sampleApp = angular.module('sampleApp', ['ui.router']);

sampleApp.config(function($stateProvider, $urlRouterProvider) {
    
    $urlRouterProvider.otherwise('/home');
    
    $stateProvider
        
        // HOME STATES AND NESTED VIEWS ========================================
        .state('usecase_cal', {
            url: '/usecase-cal',
            templateUrl: 'view/usecase_cal.html'
        })
        
        // nested list with custom controller
        .state('function_cal', {
            url: '/function-cal',
            templateUrl: 'view/function_cal.html'           
        })
        .state('user_profile', {
            url: '/user-profile',
            templateUrl: 'view/user_profile.html'           
        })
        // nested list with just some random string data
        .state('usecase_doc', {
            url: '/usecase-doc',
            templateUrl: 'view/usecase_doc.html' 
        })
        .state('fuction_doc', {
            url: '/fuction-doc',
            templateUrl: 'view/function_doc.html' 
        })
        .state('cocomo_1_cal', {
            url: '/cocomo-1-cal',
            templateUrl: 'view/cocomo_1_cal.html' 
        })
        .state('cocomo_1_doc', {
            url: '/cocomo-1-doc',
            templateUrl: 'view/cocomo_1_doc.html' 
        })
        .state('cocomo_2_doc', {
            url: '/cocomo-2-doc',
            templateUrl: 'view/cocomo_2_doc.html' 
        })
        .state('cocomo_3_doc', {
            url: '/cocomo-3-doc',
            templateUrl: 'view/cocomo_3_doc.html' 
        })
        .state('cocomo_2_cal', {
            url: '/cocomo-2-cal',
            templateUrl: 'view/cocomo_2_cal.html' 
        })
        .state('cocomo_3_cal', {
            url: '/cocomo-3-doc',
            templateUrl: 'view/cocomo_3_cal.html' 
        })

        .state('myproject', {
            url: '/myproject',
            templateUrl: 'view/myproject.html' 
        })
        .state('share_project', {
            url: '/share_project',
            templateUrl: 'view/share_project.html' 
        })
        .state('about', {
            url: '/about',
            templateUrl: 'about.html' 
        })
       
});