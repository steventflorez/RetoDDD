package logicaCliente;

import co.com.sofka.domain.generic.Entity;
import logicaBebida.values.NumeroRegistro;
import logicaCliente.values.*;

public class ClienteTipo extends Entity<ClienteTipoId> {

    private TipoCliente tipoCliente;


    public ClienteTipo(ClienteTipoId entityId, TipoCliente tipoCliente) {
        super(entityId);
        this.tipoCliente = tipoCliente;
    }

    public void ModificarTipoCliente(TipoCliente tipoNuevo){
        this.tipoCliente = tipoCliente.CambiarTipoCliente(tipoNuevo.value());
    }
}
