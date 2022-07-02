package bebida;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import logicaBebida.Bebida;
import logicaBebida.comandos.CambiarNombreMarcaCommand;
import logicaBebida.comandos.CambiarNumeroRegistroCommad;

public class CambiarNombreMarcaCase extends UseCase<RequestCommand<CambiarNombreMarcaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarNombreMarcaCommand> cambiarNombreMarcaCommandRequestCommand) {
        var command = cambiarNombreMarcaCommandRequestCommand.getCommand();
        var bebida = Bebida.from(
                command.getBebidaId(), repository().getEventsBy(command.getBebidaId().value())
        );
        bebida.cambiarValorNombreMarca(command.getMarcaId(), command.getNombreMarca());
        emit().onResponse(new ResponseEvents(bebida.getUncommittedChanges()));
    }
}
