'use strict';

module.controller('AseguradoraCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Aseguradora', {})
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
            $scope.listarRegimen=function(){
            $http.get('./webresources/Regimen', {})
                .success(function (data, status, headers, config) {
                    $scope.listaRegimen = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de regimen, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarRegimen();
        

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
        $http.post('./webresources/Aseguradora', JSON.stringify($scope.datosFormulario), {}
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
            $http.delete('./webresources/Aseguradora/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Aseguradora, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
