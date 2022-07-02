package logicaCliente.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.values.ClienteId;
import logicaCliente.values.Nombre;

public class NombreActualizado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;

    public NombreActualizado(ClienteId clienteId, Nombre nombre) {
        super("sofka.logicacliente.nombreactualizado");
        this.clienteId = clienteId;
        this.nombre = nombre;
    }
}
