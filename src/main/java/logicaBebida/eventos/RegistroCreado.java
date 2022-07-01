package logicaBebida.eventos;


import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.NumeroRegistro;
import logicaBebida.values.RegistroId;

public class RegistroCreado extends DomainEvent {

    public final RegistroId registroId;
    public final NumeroRegistro numeroRegistro;


    public RegistroCreado(RegistroId registroId, NumeroRegistro numeroRegistro) {
        super("sofka.logicabebida.registrocreado");
        this.registroId = registroId;
        this.numeroRegistro = numeroRegistro;
    }

    public RegistroId getRegistroId(){return registroId;}
    public NumeroRegistro getNumeroRegistro(){return numeroRegistro;}
}
