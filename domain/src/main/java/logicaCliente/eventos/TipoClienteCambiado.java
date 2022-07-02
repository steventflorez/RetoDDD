package logicaCliente.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.ClienteTipo;
import logicaCliente.values.*;

public class TipoClienteCambiado extends DomainEvent {
    private final ClienteTipoId clienteTipoId;
    private final TipoCliente tiponew;

    public TipoClienteCambiado(ClienteTipoId clienteTipoId, TipoCliente tiponew) {
        super("logicaCliente.eventos.TipoClienteCambiado");
        this.clienteTipoId = clienteTipoId;
        this.tiponew = tiponew;
    }

    public ClienteTipoId getClienteTipoId() {
        return clienteTipoId;
    }

    public TipoCliente gettiponew() {
        return tiponew;
    }
}
