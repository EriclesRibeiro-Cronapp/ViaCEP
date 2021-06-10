package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class ObterContatos {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var consultaContatos() throws Exception {
 return new Callable<Var>() {

   private Var dados = Var.VAR_NULL;

   public Var call() throws Exception {

    dados =
    cronapi.database.Operations.query(Var.valueOf("app.entity.ListaEndereco"),Var.valueOf("select l.cidade, l.nome, l.telefone, l.bairro, l.endereco, l.estado, l.id from ListaEndereco l"));
    return dados;
   }
 }.call();
}

}

