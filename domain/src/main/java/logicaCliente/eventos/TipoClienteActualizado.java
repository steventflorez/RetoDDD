package logicaCliente.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.values.ClienteId;
import logicaCliente.values.TipoCliente;
import logicaCliente.values.ClienteTipoId;

public class TipoClienteActualizado extends DomainEvent {
    private final ClienteId clienteId;
    private final ClienteTipoId tipoClienteId;
    private final TipoCliente tipoCliente;

    public TipoClienteActualizado(ClienteId clienteId, ClienteTipoId tipoClienteId, TipoCliente tipoCliente) {
        super("sofka.logicacliente.tipoclienteactualizado");
        this.clienteId = clienteId;
        this.tipoClienteId = tipoClienteId;
        this.tipoCliente = tipoCliente;
    }
}
