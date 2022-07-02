package logicaCliente.comandos;

import logicaCliente.values.ClienteId;
import logicaCliente.values.DocumentoId;
import logicaCliente.values.TipoDocumento;

public class ActualizarTipoDocumento {
    private final ClienteId clienteId;
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;

    public ActualizarTipoDocumento(ClienteId clienteId, DocumentoId documentoId, TipoDocumento tipoDocumento) {
        this.clienteId = clienteId;
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
    }
}
