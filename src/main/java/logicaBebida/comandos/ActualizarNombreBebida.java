package logicaBebida.comandos;

import co.com.sofka.domain.generic.Command;
import logicaBebida.values.BebidaId;
import logicaBebida.values.NombreBebida;

public class ActualizarNombreBebida extends Command {
    private final BebidaId bebidaId;
    private final NombreBebida nombreBebida;

    public ActualizarNombreBebida(BebidaId bebidaId, NombreBebida nombreBebida) {
        this.bebidaId = bebidaId;
        this.nombreBebida = nombreBebida;
    }


}
