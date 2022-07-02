package logicaCliente;

import co.com.sofka.domain.generic.EventChange;
import logicaBebida.Marca;
import logicaBebida.Registro;
import logicaBebida.eventos.BebidaCreada;
import logicaBebida.eventos.NumeroRegistroCambiado;
import logicaCliente.eventos.ClienteCreado;
import logicaCliente.eventos.TipoClienteCambiado;

public class ClienteEventChange extends EventChange {
    public ClienteEventChange(Cliente cliente) {
        apply((ClienteCreado event) ->{

                cliente.documento = new Documento(event.getDocumentoId(),event.getTipoDocumento(),event.getNumeroDocumento());
                cliente.clienteTipo=new ClienteTipo(event.getTipoClienteId(),event.getTipoCliente());
                cliente.nombre = event.getNombre();


        });
        apply((TipoClienteCambiado event) ->{
            cliente.clienteTipo.ModificarTipoCliente(event.gettiponew());

        });
    }
}
