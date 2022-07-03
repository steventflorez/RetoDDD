package logicaCliente.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.values.DocumentoId;
import logicaCliente.values.TipoDocumento;

public class TipoDocumentoCambiado extends DomainEvent {
    private final DocumentoId documentoId;
    private final TipoDocumento tiponew;

    public TipoDocumentoCambiado(DocumentoId documentoId, TipoDocumento tiponew) {
        super("logicaCliente.TipoDocumentoCambiado");
        this.documentoId = documentoId;
        this.tiponew = tiponew;

    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public TipoDocumento getTiponew() {
        return tiponew;
    }
}
