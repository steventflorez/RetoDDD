package logicaBebida.comandos;

import co.com.sofka.domain.generic.Command;
import logicaBebida.values.NumeroRegistro;
import logicaBebida.values.RegistroId;

public class CrearRegistro extends Command {

    private final RegistroId registroId;
    private final NumeroRegistro numeroRegistro;

    public CrearRegistro(RegistroId registroId, NumeroRegistro numeroRegistro) {
        this.registroId = registroId;
        this.numeroRegistro = numeroRegistro;
    }


}
