package logicaBebida.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.NombreBebida;

public class NombreBebidaActualizado extends DomainEvent {
    private final NombreBebida nombreBebida;

    public NombreBebidaActualizado(NombreBebida nombreBebida) {
        super("sofka.logicabebida.nombrebebidaactualizado");
        this.nombreBebida = nombreBebida;
    }

    public NombreBebida getNombreBebida(){return nombreBebida;}
}
