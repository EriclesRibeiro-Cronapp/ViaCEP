window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.CEP = window.blockly.js.blockly.CEP || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.CEP.buscaCEPArgs = [];
window.blockly.js.blockly.CEP.buscaCEP = async function() {
 var item;
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Bloco:Executar', async function(sender_item) {
      item = sender_item;
    if (this.cronapi.json.getProperty(item, 'erro') == true) {
      this.cronapi.screen.notify('warning','CEP inserido não existe!');
    }
    this.cronapi.screen.changeValueOfField("vars.cidadeCEP", this.cronapi.json.getProperty(item, 'localidade'));
    this.cronapi.screen.changeValueOfField("vars.enderecoCEP", this.cronapi.json.getProperty(item, 'logradouro'));
    this.cronapi.screen.changeValueOfField("vars.bairroCEP", this.cronapi.json.getProperty(item, 'bairro'));
    this.cronapi.screen.changeValueOfField("vars.estadoCEP", this.cronapi.json.getProperty(item, 'uf'));
  }.bind(this), this.cronapi.screen.getValueOfField("vars.valorCEP"));
}
