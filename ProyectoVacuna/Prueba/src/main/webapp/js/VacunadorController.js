'use strict';

module.controller('VacunadorCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Vacunador', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarCargo=function(){
            $http.get('./webresources/Cargo', {})
                .success(function (data, status, headers, config) {
                    $scope.listaCargo = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de cargo, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarCargo();
            $scope.listarTipoDocumento=function(){
            $http.get('./webresources/TipoDocumento', {})
                .success(function (data, status, headers, config) {
                    $scope.listaTipoDocumento = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de tipoDocumento, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarTipoDocumento();
            $scope.listarAplicacionVacuna=function(){
            $http.get('./webresources/AplicacionVacuna', {})
                .success(function (data, status, headers, config) {
                    $scope.listaAplicacionVacuna = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de aplicacionVacuna, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarAplicacionVacuna();
            $scope.listarGenero=function(){
            $http.get('./webresources/Genero', {})
                .success(function (data, status, headers, config) {
                    $scope.listaGenero = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de genero, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarGenero();
            $scope.listarMunicipio=function(){
            $http.get('./webresources/Municipio', {})
                .success(function (data, status, headers, config) {
                    $scope.listaMunicipio = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de municipio, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarMunicipio();
            $scope.listarIPS=function(){
            $http.get('./webresources/IPS', {})
                .success(function (data, status, headers, config) {
                    $scope.listaIPS = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de iPS, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarIPS();
        

    $scope.listar();
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        $http.post('./webresources/Vacunador', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
        if (confirm('\xbfDesea elminar este registro?')) {    
            $http.delete('./webresources/Vacunador/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Vacunador, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
