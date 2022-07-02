package Cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import logicaCliente.Cliente;
import logicaCliente.comandos.CambiarTipoClienteCommand;

public class CambiarTipoClienteUseCase extends UseCase<RequestCommand<CambiarTipoClienteCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarTipoClienteCommand> cambiarTipoClienteCommandRequestCommand) {
        var command = cambiarTipoClienteCommandRequestCommand.getCommand();
        var cliente = Cliente.from(
                command.getClienteId(), repository().getEventsBy(command.getClienteTipoId().value())
        );
        cliente.cambiarValorTipoCliente(command.getClienteTipoId(), command.getTipoCliente());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
