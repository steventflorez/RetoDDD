package Cliente;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;

import logicaCliente.comandos.CrearClienteCommand;
import logicaCliente.eventos.ClienteCreado;
import logicaCliente.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class CrearClienteUseCaseTest {
    @InjectMocks
    CrearClienteUseCase useCase;

    @Test
    public void crearCliente() {
        //arrange
        ClienteId clienteId = ClienteId.of("1");
        DocumentoId documentoId = DocumentoId.of("1");
        TipoDocumento tipoDocumento = new TipoDocumento("pasaporte");
        NumeroDocumento numeroDocumento = new NumeroDocumento(101606);
        ClienteTipoId clienteTipoId = ClienteTipoId.of("1");
        TipoCliente tipoCliente = new TipoCliente("Frecuente");
        Nombre nombre = new Nombre("Stevent");

        var command = new CrearClienteCommand(clienteId,documentoId,tipoDocumento,numeroDocumento,clienteTipoId,tipoCliente,nombre);


        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var event = (ClienteCreado) events.get(0);
        //     Assertions.assertEquals("wisquie",event.getNombreBebida());
//        Assertions.assertEquals("Usuario", event.rol().value());

    }
}