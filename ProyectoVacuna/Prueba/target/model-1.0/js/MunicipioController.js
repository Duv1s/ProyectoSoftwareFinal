'use strict';

module.controller('MunicipioCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Municipio', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarPaciente=function(){
            $http.get('./webresources/Paciente', {})
                .success(function (data, status, headers, config) {
                    $scope.listaPaciente = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de paciente, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarPaciente();
            $scope.listarDepartamento=function(){
            $http.get('./webresources/Departamento', {})
                .success(function (data, status, headers, config) {
                    $scope.listaDepartamento = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de departamento, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarDepartamento();
            $scope.listarIPS=function(){
            $http.get('./webresources/IPS', {})
                .success(function (data, status, headers, config) {
                    $scope.listaIPS = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de iPS, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarIPS();
            $scope.listarPersona=function(){
            $http.get('./webresources/Vacunador', {})
                .success(function (data, status, headers, config) {
                    $scope.listaPersona = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de persona, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarPersona();
        

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
        $http.post('./webresources/Municipio', JSON.stringify($scope.datosFormulario), {}
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
            $http.delete('./webresources/Municipio/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Municipio, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
