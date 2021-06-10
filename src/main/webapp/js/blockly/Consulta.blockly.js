window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Consulta = window.blockly.js.blockly.Consulta || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Consulta.consultaArgs = [];
window.blockly.js.blockly.Consulta.consulta = async function() {
 var item;
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.ObterContatos:consultaContatos', async function(sender_item) {
      item = sender_item;
    this.cronapi.screen.changeValueOfField("vars.listaEndereco", item);
  }.bind(this));
}
