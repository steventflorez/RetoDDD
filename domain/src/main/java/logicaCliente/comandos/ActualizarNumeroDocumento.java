package logicaCliente.comandos;

import co.com.sofka.domain.generic.Command;
import logicaCliente.values.ClienteId;
import logicaCliente.values.DocumentoId;
import logicaCliente.values.NumeroDocumento;

public class ActualizarNumeroDocumento extends Command {
    private final ClienteId clienteId;
    private final DocumentoId documentoId;
    private final NumeroDocumento numeroDocumento;

    public ActualizarNumeroDocumento(ClienteId clienteId, DocumentoId documentoId, NumeroDocumento numeroDocumento) {
        this.clienteId = clienteId;
        this.documentoId = documentoId;
        this.numeroDocumento = numeroDocumento;
    }
}
