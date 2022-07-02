package logicaCliente.comandos;

import co.com.sofka.domain.generic.Command;
import logicaCliente.values.DocumentoId;
import logicaCliente.values.NumeroDocumento;
import logicaCliente.values.TipoDocumento;

public class CrearDocumento extends Command {
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;

    public CrearDocumento(DocumentoId documentoId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento) {
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
}
