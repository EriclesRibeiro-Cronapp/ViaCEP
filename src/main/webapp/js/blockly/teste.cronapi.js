(function() {
  'use strict';

  this.cronapi = this.cronapi || {};

   /**
   * @categoryName Teste
   */
  this.cronapi.myfunctions = this.cronapi.myfunctions || {};
  
  /**
   * @type function
   * @name Teste
   * @description Descrição da Função
   * @multilayer false
   * @param {ObjectType.STRING} input Param Description
   * @returns {ObjectType.STRING}
   */
  this.cronapi.myfunctions.teste = function(/** @type {ObjectType.STRING} @description Parâmetro: Descrição do parâmetro */input) {
    return "INPUT" + input;
  };
  

}).bind(window)();