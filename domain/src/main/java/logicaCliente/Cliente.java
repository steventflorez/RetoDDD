package logicaCliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.eventos.ClienteCreado;
import logicaCliente.eventos.TipoClienteCambiado;
import logicaCliente.eventos.TipoDocumentoCambiado;
import logicaCliente.values.*;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {
    protected Documento documento;
    protected ClienteTipo clienteTipo;
    protected Nombre nombre;

    public Cliente(ClienteId entityId, DocumentoId documentoId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento, ClienteTipoId tipoClienteId, TipoCliente tipoCliente, Nombre nombre) {
        super(entityId);
        appendChange(new ClienteCreado(documentoId,tipoDocumento, numeroDocumento,tipoClienteId,tipoCliente,nombre)).apply();
        subscribe(new ClienteEventChange(this));

    }
    public void cambiarValorTipoCliente(ClienteTipoId clienteTipoId,TipoCliente tiponew){
        appendChange(new TipoClienteCambiado(clienteTipoId,tiponew)).apply();
    }
    public void cambiarValorTipoDocumento(DocumentoId documentoId,TipoDocumento tiponew){
        appendChange(new TipoDocumentoCambiado(documentoId,tiponew)).apply();
    }
    public Cliente(ClienteId id) {
        super(id);
        subscribe(new ClienteEventChange(this));
    }

    public static Cliente from(ClienteId id, List<DomainEvent> events){
        var cliente = new Cliente((id));
        events.forEach(cliente::applyEvent);
        return cliente;
    }
}
