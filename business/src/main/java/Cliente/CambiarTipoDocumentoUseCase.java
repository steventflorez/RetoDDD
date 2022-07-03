package Cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import logicaCliente.Cliente;
import logicaCliente.comandos.CambiarTipoDocumentoCommand;

public class CambiarTipoDocumentoUseCase extends UseCase<RequestCommand<CambiarTipoDocumentoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarTipoDocumentoCommand> cambiarTipoDocumentoCommandRequestCommand) {
        var command = cambiarTipoDocumentoCommandRequestCommand.getCommand();
        var cliente = Cliente.from(
                command.getClienteId(), repository().getEventsBy(command.getDocumentoId().value())

        );
        cliente.cambiarValorTipoDocumento(command.getDocumentoId(),command.getTipoDocumento());
        emit().onResponse((new ResponseEvents(cliente.getUncommittedChanges())));
    }
}
