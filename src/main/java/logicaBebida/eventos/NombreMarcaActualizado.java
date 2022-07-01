package logicaBebida.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.NombreMarca;

public class NombreMarcaActualizado extends DomainEvent {
    public final NombreMarca nombreMarca;

    public NombreMarcaActualizado(NombreMarca nombreMarca) {
        super("sofka.logicabebida.nombremarcaactualizado");
        this.nombreMarca = nombreMarca;
    }

    public NombreMarca getNombreMarca(){return nombreMarca;}
}
