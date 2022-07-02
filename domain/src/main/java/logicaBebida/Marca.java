package logicaBebida;

import co.com.sofka.domain.generic.Entity;
import logicaBebida.values.MarcaId;
import logicaBebida.values.NombreMarca;

public class Marca extends Entity<MarcaId> {
    protected NombreMarca nombreMarca;

    public Marca(MarcaId entityId, NombreMarca nombreMarca) {
        super(entityId);
        this.nombreMarca = nombreMarca;

    }
}
