package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Bloco
public static Var Executar(@ParamMetaData(description = "CEP") Var CEP) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;
   private Var ex = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        item =
        cronapi.json.Operations.toJson(
        cronapi.util.Operations.getURLFromOthers(
        Var.valueOf("GET"),
        Var.valueOf("application/json"),
        Var.valueOf(
        Var.valueOf("https://viacep.com.br/ws/").toString() +
        CEP.toString() +
        Var.valueOf("/json/").toString()), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL,
        Var.valueOf(""),
        Var.valueOf("BODY")));
     } catch (Exception ex_exception) {
          ex = Var.valueOf(ex_exception);

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("CEP não reconhecido!"));
     }
    return item;
   }
 }.call();
}

}

