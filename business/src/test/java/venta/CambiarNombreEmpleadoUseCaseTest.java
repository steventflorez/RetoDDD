package venta;

import Cliente.CambiarTipoDocumentoUseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.BebidaId;
import logicaCliente.comandos.CambiarTipoDocumentoCommand;
import logicaCliente.eventos.ClienteCreado;

import logicaCliente.eventos.TipoDocumentoCambiado;
import logicaCliente.values.*;
import logicaVenta.NombreEmpleadoCambiado;
import logicaVenta.comandos.CambiarNombreEmpleadoCommand;
import logicaVenta.eventos.VentaCreada;
import logicaVenta.values.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class CambiarNombreEmpleadoUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @InjectMocks
    CambiarNombreEmpleadoUseCase usecase;

    @Test
    void cambiarNombreEmpleado() {
        //arrange
        VentaId ventaId = VentaId.of("1");
        EmpleadoId empleadoId = EmpleadoId.of("1");
        NombreEmpleado nombreEmpleado = new NombreEmpleado("Stevent");

        var command = new CambiarNombreEmpleadoCommand(ventaId,empleadoId,nombreEmpleado);
        when(repository.getEventsBy(ventaId.value())).thenReturn(history());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (NombreEmpleadoCambiado)events.get(0);
        // Assertions.assertEquals("General", event.rolCuenta().value());

    }

    private List<DomainEvent> history() {

            ClienteId clienteId = ClienteId.of("1");
            BebidaId bebidaId = BebidaId.of("1");
            EmpleadoId empleadoId = EmpleadoId.of("1");
            NombreEmpleado nombreEmpleado = new NombreEmpleado("Stevent");
            LocalId localId= LocalId.of("1");
            Calle calle = new Calle(54);
            Carrera carrera = new Carrera(70);
            Nomenclatura nomenclatura = new Nomenclatura(5);
            Cantidad cantidad = new Cantidad(1);
            return List.of(
                    new VentaCreada(clienteId,bebidaId,empleadoId,nombreEmpleado,localId,calle,carrera,nomenclatura,cantidad)
            );
    }

}