package logicaBebida.comandos;

import co.com.sofka.domain.generic.Command;
import logicaBebida.values.BebidaId;
import logicaBebida.values.Descripcion;

public class ActualizarDescripcion extends Command {
    private final BebidaId bebidaId;
    private final Descripcion desripcion;

    public ActualizarDescripcion(BebidaId bebidaId, Descripcion desripcion) {
        this.bebidaId = bebidaId;
        this.desripcion = desripcion;
    }


}
