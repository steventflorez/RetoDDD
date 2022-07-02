package logicaBebida.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.NumeroRegistro;
import logicaBebida.values.RegistroId;

public class NumeroRegistroCambiado extends DomainEvent {

    private final RegistroId registroId;
    private final NumeroRegistro numeroNew;

    public NumeroRegistroCambiado(RegistroId registroId, NumeroRegistro numeroNew) {
        super("logicaBebida.NumeroRegistroCambiado");
        this.registroId = registroId;
        this.numeroNew = numeroNew;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public NumeroRegistro getNumeroNew() {
        return numeroNew;
    }
}
