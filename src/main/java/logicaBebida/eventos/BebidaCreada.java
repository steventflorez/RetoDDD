package logicaBebida.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.*;

public class BebidaCreada extends DomainEvent {
    private final BebidaId bebidaId;
    private final MarcaId marcaId;
    private final RegistroId registroId;
    protected final Descripcion descripcion;
    private final NombreBebida nombreBebida;

    public BebidaCreada(BebidaId bebidaId, MarcaId marcaId, RegistroId registroId, Descripcion descripcion, NombreBebida nombreBebida) {
        super("sofka.logicabebida.bebidacreada");
        this.bebidaId = bebidaId;
        this.marcaId = marcaId;
        this.registroId = registroId;
        this.descripcion = descripcion;
        this.nombreBebida = nombreBebida;
    }



}
