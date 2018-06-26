'use strict';

module.controller('PacienteCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Paciente', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarTipoDocumento=function(){
            $http.get('./webresources/TipoDocumento', {})
                .success(function (data, status, headers, config) {
                    $scope.listaTipoDocumento = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de tipoDocumento, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarTipoDocumento();
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
        $scope.listarTipoResidencia=function(){
            $http.get('./webresources/TipoResidencia', {})
                .success(function (data, status, headers, config) {
                    $scope.listaTipoResidencia = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de tipoResidencia, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarTipoResidencia();
            $scope.listarGrupoEtnico=function(){
            $http.get('./webresources/GrupoEtnico', {})
                .success(function (data, status, headers, config) {
                    $scope.listaGrupoEtnico = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de grupoEtnico, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarGrupoEtnico();
            $scope.listarAplicacionVacuna=function(){
            $http.get('./webresources/AplicacionVacuna', {})
                .success(function (data, status, headers, config) {
                    $scope.listaAplicacionVacuna = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de aplicacionVacuna, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarAplicacionVacuna();
            $scope.listarAcudiente=function(){
            $http.get('./webresources/Acudiente', {})
                .success(function (data, status, headers, config) {
                    $scope.listaAcudiente = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de acudiente, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarAcudiente();
            $scope.listarAseguradora=function(){
            $http.get('./webresources/Aseguradora', {})
                .success(function (data, status, headers, config) {
                    $scope.listaAseguradora = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de aseguradora, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarAseguradora();
        

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
        $http.post('./webresources/Paciente', JSON.stringify($scope.datosFormulario), {}
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
            $http.delete('./webresources/Paciente/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Paciente, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
