package logicaBebida.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.Descripcion;

public class DescripcionActualizada  extends DomainEvent {
    private final Descripcion descripcion;

    public DescripcionActualizada(Descripcion descripcion) {
        super("sofka.logicabebida.descripcionactualizada");
        this.descripcion = descripcion;
    }
    public Descripcion getDescripcion(){return descripcion;}
}
