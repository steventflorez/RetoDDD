package bebida;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import logicaBebida.Bebida;
import logicaBebida.comandos.CambiarNumeroRegistroCommad;

import java.lang.reflect.RecordComponent;

public class CambiarNumeroRegistroUseCase extends UseCase<RequestCommand<CambiarNumeroRegistroCommad>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarNumeroRegistroCommad> cambiarNumeroRegistroCommadRequestCommand) {
        var command = cambiarNumeroRegistroCommadRequestCommand.getCommand();
        var bebida = Bebida.from(
                command.getBebidaId(), repository().getEventsBy(command.getBebidaId().value())
        );

        bebida.cambiarValorNumeroRegistro(command.getRegistroId(), command.getNumeroRegistro());

        emit().onResponse(new ResponseEvents(bebida.getUncommittedChanges()));
    }
}
