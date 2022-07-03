package venta;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;

import logicaBebida.values.BebidaId;
import logicaCliente.values.*;
import logicaVenta.eventos.VentaCreada;
import logicaVenta.comandos.CrearVentaCommand;
import logicaVenta.values.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)

class CrearVentaUseCaseTest {
    @InjectMocks
    CrearVentaUseCase useCase;

    @Test
    public void crearVenta() {
        //arrange
        VentaId ventaId = VentaId.of("1");
        ClienteId clienteId = ClienteId.of("1");
        BebidaId bebidaId = BebidaId.of("1");
        EmpleadoId empleadoId = EmpleadoId.of("1");
        NombreEmpleado nombreEmpleado = new NombreEmpleado("stevent");
        LocalId localId = LocalId.of("1");
        Calle calle = new Calle(54);
        Carrera carrera = new Carrera(75);
        Nomenclatura nomenclatura = new Nomenclatura(5);
        Cantidad cantidad = new Cantidad(1);

        var command = new CrearVentaCommand(ventaId,clienteId,bebidaId,empleadoId,nombreEmpleado,localId,calle,carrera,nomenclatura,cantidad);


        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var event = (VentaCreada) events.get(0);
        //     Assertions.assertEquals("wisquie",event.getNombreBebida());
//        Assertions.assertEquals("Usuario", event.rol().value());

    }

}