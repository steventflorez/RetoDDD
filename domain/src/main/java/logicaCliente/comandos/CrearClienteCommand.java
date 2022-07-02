package logicaCliente.comandos;

import co.com.sofka.domain.generic.Command;
import logicaCliente.values.*;

public class CrearClienteCommand extends Command {
    private final ClienteId clienteId;
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;
    private final ClienteTipoId tipoClienteId;
    private final TipoCliente tipoCliente;
    private final Nombre nombre;

    public CrearClienteCommand(ClienteId clienteId, DocumentoId documentoId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento, ClienteTipoId tipoClienteId, TipoCliente tipoCliente, Nombre nombre) {
        this.clienteId = clienteId;
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.tipoClienteId = tipoClienteId;
        this.tipoCliente = tipoCliente;
        this.nombre = nombre;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NumeroDocumento getNumeroDocumento() {
        return numeroDocumento;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public ClienteTipoId getTipoClienteId() {
        return tipoClienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
