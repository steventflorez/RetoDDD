package logicaCliente;

import co.com.sofka.domain.generic.Entity;
import logicaCliente.values.DocumentoId;
import logicaCliente.values.NumeroDocumento;
import logicaCliente.values.TipoDocumento;

public class Documento extends Entity<DocumentoId> {
    private TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;

    public Documento(DocumentoId entityId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento) {
        super(entityId);
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
    public void ModificarTipoDocumento(TipoDocumento tipoNuevo){
        this.tipoDocumento = tipoDocumento.CambiarTipoDocumento(tipoNuevo.value());
    }
}
