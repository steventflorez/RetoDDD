package bebida;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import logicaBebida.comandos.CrearBebidaCommand;
import logicaBebida.eventos.BebidaCreada;
import logicaBebida.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

class CrearBebidaUseCaseTest {
    @InjectMocks
    CrearBebidaUseCase useCase;

    @Test
    public void crearBebida(){
        //arrange
        BebidaId bebidaId = BebidaId.of("1");
        MarcaId marcaId = MarcaId.of("1");
        NombreMarca nombreMarca = new NombreMarca("OldPar");
        RegistroId registroId = RegistroId.of("1");
        NumeroRegistro numeroRegistro = new NumeroRegistro(56);
        Descripcion descripcion = new Descripcion("es un trago fuerte");
        NombreBebida nombreBebida = new NombreBebida("wisquie");

        var command = new CrearBebidaCommand(bebidaId,marcaId,nombreMarca,registroId,numeroRegistro,descripcion,nombreBebida);


        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var event = (BebidaCreada)events.get(0);
  //     Assertions.assertEquals("wisquie",event.getNombreBebida());
//        Assertions.assertEquals("Usuario", event.rol().value());

    }
}