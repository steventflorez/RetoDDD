package logicaBebida;

import co.com.sofka.domain.generic.Entity;
import logicaBebida.values.NumeroRegistro;
import logicaBebida.values.RegistroId;

public class Registro extends Entity<RegistroId> {

    protected NumeroRegistro numeroRegistro;

    public Registro(RegistroId entityId, NumeroRegistro numeroRegistro) {
        super(entityId);
        this.numeroRegistro = numeroRegistro;
    }
}
