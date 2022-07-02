package Cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import logicaCliente.Cliente;
import logicaCliente.comandos.CrearClienteCommand;

public class CrearClienteUseCase extends UseCase<RequestCommand<CrearClienteCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearClienteCommand> crearClienteCommandRequestCommand) {
        var command = crearClienteCommandRequestCommand.getCommand();
        var cliente = new Cliente(
                command.getClienteId(),
                command.getDocumentoId(),
                command.getTipoDocumento(),
                command.getNumeroDocumento(),
                command.getTipoClienteId(),
                command.getTipoCliente(),
                command.getNombre()

        );
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
