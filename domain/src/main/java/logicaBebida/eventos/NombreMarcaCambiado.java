package logicaBebida.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.MarcaId;
import logicaBebida.values.NombreMarca;

public class NombreMarcaCambiado extends DomainEvent {
    private final MarcaId marcaId;
    private final NombreMarca marcaNew;

    public NombreMarcaCambiado(MarcaId marcaId, NombreMarca marcaNew) {
        super("logicaBebida.nombreMarcaCambiado");

        this.marcaId = marcaId;
        this.marcaNew = marcaNew;
    }

    public MarcaId getMarcaId() {
        return marcaId;
    }

    public NombreMarca getMarcaNew() {
        return marcaNew;
    }
}
