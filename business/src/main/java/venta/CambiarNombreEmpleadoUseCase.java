package venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import logicaVenta.Venta;
import logicaVenta.comandos.CambiarNombreEmpleadoCommand;

public class CambiarNombreEmpleadoUseCase extends UseCase<RequestCommand<CambiarNombreEmpleadoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarNombreEmpleadoCommand> cambiarNombreEmpleadoCommandRequestCommand) {
        var command = cambiarNombreEmpleadoCommandRequestCommand.getCommand();
        var venta = Venta.from(
                command.getVentaId(), repository().getEventsBy(command.getEmpleadoId().value())
        );
        venta.cambiarValorNombreEmpleado(command.getEmpleadoId(),command.getNombreEmpleado());
        emit().onResponse((new ResponseEvents(venta.getUncommittedChanges())));
    }
}
