'use strict';


// Declare app level module which depends on filters, and services
var app = angular.module('admininvalid', [
    'ngRoute',
    'angularUtils.directives.dirPagination',
    'admininvalid.controllers'
]);
app.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: 'partials/menu.html'});
        $routeProvider.when('/TipoDocumento', {templateUrl: 'partials/TipoDocumento.html', controller: 'TipoDocumentoCtrl'});
         $routeProvider.when('/TipoResidencia', {templateUrl: 'partials/TipoResidencia.html', controller: 'TipoResidenciaCtrl'});
        $routeProvider.when('/Cargo', {templateUrl: 'partials/Cargo.html', controller: 'CargoCtrl'});
        $routeProvider.when('/Paciente', {templateUrl: 'partials/Paciente.html', controller: 'PacienteCtrl'});
        $routeProvider.when('/Pais', {templateUrl: 'partials/Pais.html', controller: 'PaisCtrl'});
        $routeProvider.when('/Departamento', {templateUrl: 'partials/Departamento.html', controller: 'DepartamentoCtrl'});
        $routeProvider.when('/AplicacionVacuna', {templateUrl: 'partials/AplicacionVacuna.html', controller: 'AplicacionVacunaCtrl'});
        $routeProvider.when('/Municipio', {templateUrl: 'partials/Municipio.html', controller: 'MunicipioCtrl'});
        $routeProvider.when('/Genero', {templateUrl: 'partials/Genero.html', controller: 'GeneroCtrl'});
        $routeProvider.when('/Dosis', {templateUrl: 'partials/Dosis.html', controller: 'DosisCtrl'});
        $routeProvider.when('/Vacunador', {templateUrl: 'partials/Vacunador.html', controller: 'VacunadorCtrl'});
        $routeProvider.when('/Biologico', {templateUrl: 'partials/Biologico.html', controller: 'BiologicoCtrl'});
        $routeProvider.when('/GrupoEtnico', {templateUrl: 'partials/GrupoEtnico.html', controller: 'GrupoEtnicoCtrl'});
        $routeProvider.when('/IPS', {templateUrl: 'partials/IPS.html', controller: 'IPSCtrl'});
        $routeProvider.otherwise({redirectTo: '/'});
    }]);

var module = angular.module("admininvalid.controllers", []);
