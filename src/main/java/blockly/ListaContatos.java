package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class ListaContatos {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 */
// Descreva esta função...
public static void salvarContato(@ParamMetaData(description = "cidade") Var cidade, @ParamMetaData(description = "estado") Var estado, @ParamMetaData(description = "telefone") Var telefone, @ParamMetaData(description = "endereco") Var endereco, @ParamMetaData(description = "bairro") Var bairro, @ParamMetaData(description = "nome") Var nome) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.database.Operations.insert(Var.valueOf("app.entity.ListaEndereco"),Var.valueOf("cidade",cidade),Var.valueOf("estado",estado),Var.valueOf("telefone",telefone),Var.valueOf("endereco",endereco),Var.valueOf("bairro",bairro),Var.valueOf("nome",nome));

    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf(
    Var.valueOf("Usuário \"").toString() +
    nome.toString() +
    Var.valueOf("\" cadastrado com sucesso!").toString()));
   return Var.VAR_NULL;
   }
 }.call();
}

}

