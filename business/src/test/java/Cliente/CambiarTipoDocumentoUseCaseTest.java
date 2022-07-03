package Cliente;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import logicaCliente.comandos.CambiarTipoDocumentoCommand;
import logicaCliente.eventos.ClienteCreado;

import logicaCliente.eventos.TipoDocumentoCambiado;
import logicaCliente.values.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class CambiarTipoDocumentoUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @InjectMocks
    CambiarTipoDocumentoUseCase usecase;

    @Test
    void cambiarTipoDocumento() {
        //arrange
        ClienteId clienteId = ClienteId.of("1");
        DocumentoId documentoId = DocumentoId.of("1");
        TipoDocumento tipoDocumento = new TipoDocumento("cedula");

        var command = new CambiarTipoDocumentoCommand(clienteId,documentoId,tipoDocumento);
        when(repository.getEventsBy(clienteId.value())).thenReturn(history());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (TipoDocumentoCambiado)events.get(0);
        // Assertions.assertEquals("General", event.rolCuenta().value());

    }

    private List<DomainEvent> history() {

        DocumentoId documentoId = DocumentoId.of("1");
        TipoDocumento tipoDocumento = new TipoDocumento("cedula");
        NumeroDocumento numeroDocumento = new NumeroDocumento(125);
        ClienteTipoId clienteTipoId= ClienteTipoId.of("1");
        TipoCliente tipoCliente = new TipoCliente("vippp");
        Nombre nombre = new Nombre("stevent");

        return List.of(
                new ClienteCreado(documentoId,tipoDocumento,numeroDocumento,clienteTipoId,tipoCliente,nombre)
        );
    }
}