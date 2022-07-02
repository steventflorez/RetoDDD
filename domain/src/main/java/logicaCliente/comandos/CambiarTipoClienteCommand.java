package logicaCliente.comandos;

import co.com.sofka.domain.generic.Command;
import logicaCliente.values.ClienteId;
import logicaCliente.values.TipoCliente;
import logicaCliente.values.ClienteTipoId;

public class CambiarTipoClienteCommand extends Command {
    private final ClienteId clienteId;
    private final ClienteTipoId clienteTipoId;
    private final TipoCliente tipoCliente;

    public CambiarTipoClienteCommand(ClienteId clienteId, ClienteTipoId tipoClienteId, TipoCliente tipoCliente) {
        this.clienteId = clienteId;
        this.clienteTipoId = tipoClienteId;
        this.tipoCliente = tipoCliente;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public ClienteTipoId getClienteTipoId() {
        return clienteTipoId;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
}
