package bebida;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import logicaBebida.Bebida;
import logicaBebida.comandos.CrearBebidaCommand;

public class CrearBebidaUseCase extends UseCase<RequestCommand<CrearBebidaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearBebidaCommand> crearBebidaCommandRequestCommand) {
        var command = crearBebidaCommandRequestCommand.getCommand();
        var bebida = new Bebida(
                command.getBebidaId(),
                command.getMarcaId(),
                command.getNombreMarca(),
                command.getRegistroId(),
                command.getNumeroRegistro(),
                command.getDescripcion(),
                command.getNombreBebida()
        );

        emit().onResponse(new ResponseEvents(bebida.getUncommittedChanges()));
    }
}
