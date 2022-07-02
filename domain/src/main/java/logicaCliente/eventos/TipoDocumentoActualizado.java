package logicaCliente.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.values.ClienteId;
import logicaCliente.values.DocumentoId;
import logicaCliente.values.TipoDocumento;

public class TipoDocumentoActualizado extends DomainEvent {
    private final ClienteId clienteId;
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;

    public TipoDocumentoActualizado(ClienteId clienteId, DocumentoId documentoId, TipoDocumento tipoDocumento) {
        super("sofka.logicacliente.tipodocumentoactualizado");
        this.clienteId = clienteId;
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
    }
}
