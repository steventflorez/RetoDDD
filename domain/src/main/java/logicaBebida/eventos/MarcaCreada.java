package logicaBebida.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.MarcaId;
import logicaBebida.values.NombreMarca;

public class MarcaCreada extends DomainEvent {
    private final MarcaId marcaId;
    private final NombreMarca nombreMarca;

    public MarcaCreada(MarcaId marcaId, NombreMarca nombreMarca) {
        super("sofka.logicabebida.marcacreada");
        this.marcaId = marcaId;
        this.nombreMarca = nombreMarca;
    }

    public MarcaId getMarcaId(){return marcaId;}
    public NombreMarca getNombreMarca(){return nombreMarca;}
}
