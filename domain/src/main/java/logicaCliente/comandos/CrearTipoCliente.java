package logicaCliente.comandos;

import co.com.sofka.domain.generic.Command;
import logicaCliente.values.TipoCliente;
import logicaCliente.values.ClienteTipoId;

public class CrearTipoCliente extends Command {
    private final ClienteTipoId tipoClienteId;
    private final TipoCliente tipoCliente;

    public CrearTipoCliente(ClienteTipoId tipoClienteId, TipoCliente tipoCliente) {
        this.tipoClienteId = tipoClienteId;
        this.tipoCliente = tipoCliente;
    }
}
