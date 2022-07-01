package logicaBebida;

import co.com.sofka.domain.generic.Entity;
import logicaBebida.values.*;

public class Bebida extends Entity<BebidaId> {
    protected MarcaId marcaId;
    protected RegistroId registroId;
    protected Descripcion descripcion;
    protected NombreBebida nombreBebida;

    public Bebida(BebidaId entityId, MarcaId marcaId,RegistroId registroId, Descripcion descripcion, NombreBebida nombreBebida) {

        super(entityId);
        this.marcaId = marcaId;
        this.registroId = registroId;
        this.descripcion = descripcion;
        this.nombreBebida = nombreBebida;

    }
}
