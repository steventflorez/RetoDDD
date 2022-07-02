package logicaCliente.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.values.DocumentoId;
import logicaCliente.values.NumeroDocumento;
import logicaCliente.values.TipoDocumento;

public class DocumentoCreado extends DomainEvent {
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;

    public DocumentoCreado(DocumentoId documentoId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento) {
        super("sofka.logicacliente.documentocreado");
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
}
