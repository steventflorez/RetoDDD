package logicaBebida.comandos;

import co.com.sofka.domain.generic.Command;
import logicaBebida.values.BebidaId;
import logicaBebida.values.NumeroRegistro;
import logicaBebida.values.RegistroId;

public class CambiarNumeroRegistroCommad extends Command {
    private final BebidaId bebidaId;
    private final RegistroId registroId;
    private final NumeroRegistro numeroRegistro;

    public CambiarNumeroRegistroCommad(BebidaId bebidaId, RegistroId registroId, NumeroRegistro numeroRegistro) {
        this.bebidaId = bebidaId;
        this.registroId = registroId;
        this.numeroRegistro = numeroRegistro;
    }

    public BebidaId getBebidaId() {
        return bebidaId;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public NumeroRegistro getNumeroRegistro() {
        return numeroRegistro;
    }
}
