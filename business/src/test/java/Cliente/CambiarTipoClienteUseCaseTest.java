package Cliente;



import bebida.CambiarNombreMarcaCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.comandos.CambiarNombreMarcaCommand;
import logicaBebida.comandos.CambiarNumeroRegistroCommad;
import logicaBebida.comandos.CrearBebidaCommand;
import logicaBebida.eventos.BebidaCreada;
import logicaBebida.eventos.NombreMarcaCambiado;
import logicaBebida.eventos.NumeroRegistroCambiado;
import logicaBebida.values.*;

import logicaCliente.comandos.CambiarTipoClienteCommand;
import logicaCliente.eventos.TipoClienteCambiado;
import logicaCliente.values.ClienteId;
import logicaCliente.values.ClienteTipoId;
import logicaCliente.values.TipoCliente;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class CambiarTipoClienteUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @InjectMocks
    CambiarTipoClienteUseCase usecase;

    @Test
    void cambiarTipoCliente() {
        //arrange
        ClienteId clienteId = ClienteId.of("1");
        ClienteTipoId clienteTipoId = ClienteTipoId.of("1");
        TipoCliente tipoCliente = new TipoCliente("vipipyyy");

        var command = new CambiarTipoClienteCommand(clienteId,clienteTipoId,tipoCliente);
        when(repository.getEventsBy(clienteId.value())).thenReturn(history());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (NombreMarcaCambiado)events.get(0);
        // Assertions.assertEquals("General", event.rolCuenta().value());

    }

    private List<DomainEvent> history() {

        ClienteTipoId clienteTipoId = ClienteTipoId.of("1");
        TipoCliente tipoCliente = new TipoCliente("vip");

        return List.of(
                new TipoClienteCambiado(clienteTipoId,tipoCliente)
        );
    }

}