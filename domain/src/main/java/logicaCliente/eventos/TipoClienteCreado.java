package logicaCliente.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.values.TipoCliente;
import logicaCliente.values.ClienteTipoId;

public class TipoClienteCreado extends DomainEvent {
    private final ClienteTipoId tipoClienteId;
    private final TipoCliente tipoCliente;

    public TipoClienteCreado(ClienteTipoId tipoClienteId, TipoCliente tipoCliente) {
        super("logicacliente.TipoclienteCreado");
        this.tipoClienteId = tipoClienteId;
        this.tipoCliente = tipoCliente;
    }

    public ClienteTipoId getTipoClienteId() {
        return tipoClienteId;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
}
