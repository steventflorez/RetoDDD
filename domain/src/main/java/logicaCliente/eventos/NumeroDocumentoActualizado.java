package logicaCliente.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.values.ClienteId;
import logicaCliente.values.DocumentoId;
import logicaCliente.values.NumeroDocumento;

public class NumeroDocumentoActualizado extends DomainEvent {
    private final ClienteId clienteId;
    private final DocumentoId documentoId;
    private final NumeroDocumento numeroDocumento;

    public NumeroDocumentoActualizado(ClienteId clienteId, DocumentoId documentoId, NumeroDocumento numeroDocumento) {
        super("sofka.logicacliente.numerodocumentoactualizado");
        this.clienteId = clienteId;
        this.documentoId = documentoId;
        this.numeroDocumento = numeroDocumento;
    }
}
