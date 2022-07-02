package logicaCliente.comandos;

import co.com.sofka.domain.generic.Command;
import logicaCliente.values.ClienteId;
import logicaCliente.values.Nombre;

public class ActualizarNombre extends Command {
    private final ClienteId clienteId;
    private final Nombre nombre;

    public ActualizarNombre(ClienteId clienteId, Nombre nombre) {
        this.clienteId = clienteId;
        this.nombre = nombre;
    }
}
