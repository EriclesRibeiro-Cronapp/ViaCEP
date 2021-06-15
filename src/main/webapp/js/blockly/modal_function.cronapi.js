(function() {
  'use strict';

  this.cronapi = this.cronapi || {};

   /**
   * @categoryName ModalEdit
   */
  this.cronapi.myfunctions = this.cronapi.myfunctions || {};
  
  /**
   * @type function
   * @name Abrir Modal
   * @description Abre modal específica
   * @multilayer false
   * @param {ObjectType.STRING} input Param Description
   * @param {ObjectType.OBJECT} input Param Description
   *  @type {ObjectType.STRING} input
   */
  this.cronapi.myfunctions.abrirModalPerfil = function(/** @type {ObjectType.OBJECT} @description {{Identificador}} @blockType ids_from_screen*/ id){
  $('#'+ id).appendTo('body').modal('show')

  
} 
this.cronapi.myfunctions.modal = function(/** @type {ObjectType.OBJECT} @description {{Identificador}} @blockType ids_from_screen*/ id){
  $('#'+ id).appendTo('body').modal('show')

  
} 



  

}).bind(window)();