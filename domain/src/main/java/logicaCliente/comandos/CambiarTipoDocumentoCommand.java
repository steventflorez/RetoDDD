package logicaCliente.comandos;

import co.com.sofka.domain.generic.Command;
import logicaCliente.values.ClienteId;
import logicaCliente.values.DocumentoId;
import logicaCliente.values.TipoDocumento;

public class CambiarTipoDocumentoCommand extends Command {
    private final ClienteId clienteId;
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;

    public CambiarTipoDocumentoCommand(ClienteId clienteId, DocumentoId documentoId, TipoDocumento tipoDocumento) {
        this.clienteId = clienteId;
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
}
