package logicaCliente.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.values.*;

public class ClienteCreado extends DomainEvent {
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;
    private final ClienteTipoId tipoClienteId;
    private final TipoCliente tipoCliente;
    private final Nombre nombre;

    public ClienteCreado(DocumentoId documentoId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento, ClienteTipoId tipoClienteId, TipoCliente tipoCliente, Nombre nombre) {
        super("logicaCliente.ClienteCreado");
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.tipoClienteId = tipoClienteId;
        this.tipoCliente = tipoCliente;
        this.nombre = nombre;
    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NumeroDocumento getNumeroDocumento() {
        return numeroDocumento;
    }

    public ClienteTipoId getTipoClienteId() {
        return tipoClienteId;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
