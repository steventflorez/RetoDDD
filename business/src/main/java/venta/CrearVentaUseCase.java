package venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import logicaVenta.Venta;
import logicaVenta.comandos.CrearVentaCommand;

public class CrearVentaUseCase extends UseCase<RequestCommand<CrearVentaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearVentaCommand> crearVentaCommandRequestCommand) {
        var command = crearVentaCommandRequestCommand.getCommand();
        var venta = new Venta(
                command.getVentaId(),
                command.getClienteId(),
                command.getBebidaId(),
                command.getEmpleadoId(),
                command.getNombreEmpleado(),
                command.getLocalId(),
                command.getCalle(),
                command.getCarrera(),
                command.getNomenclatura(),
                command.getCantidad()
        );
        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));

    }
}
