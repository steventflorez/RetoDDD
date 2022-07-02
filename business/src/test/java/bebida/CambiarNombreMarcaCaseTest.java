package bebida;

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

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CambiarNombreMarcaCaseTest {
    @Mock
    DomainEventRepository repository;

    @InjectMocks
    CambiarNombreMarcaCase usecase;

    @Test
    void cambiarNumeroRegistro() {
        //arrange
        BebidaId bebidaId = BebidaId.of("1");
        MarcaId marcaId = MarcaId.of("1");
        NombreMarca nombreMarca = new NombreMarca("Kasike");

        var command = new CambiarNombreMarcaCommand(bebidaId,marcaId,nombreMarca);
        when(repository.getEventsBy(bebidaId.value())).thenReturn(history());
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

        MarcaId marcaId = MarcaId.of("1");
        NombreMarca nombreMarca = new NombreMarca("OldPar");
        RegistroId registroId = RegistroId.of("1");
        NumeroRegistro numeroRegistro = new NumeroRegistro(56);
        Descripcion descripcion = new Descripcion("es un trago fuerte");
        NombreBebida nombreBebida = new NombreBebida("wisquie");
        return List.of(
                new BebidaCreada(marcaId,nombreMarca,registroId,numeroRegistro,descripcion,nombreBebida)
        );
    }

}