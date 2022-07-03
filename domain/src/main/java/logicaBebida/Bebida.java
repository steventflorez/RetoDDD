package logicaBebida;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.eventos.BebidaCreada;
import logicaBebida.eventos.NombreMarcaCambiado;
import logicaBebida.eventos.NumeroRegistroCambiado;
import logicaBebida.values.*;

import java.util.List;

public class Bebida extends AggregateEvent<BebidaId> {
    protected Marca marca;
    protected Registro registro;
    protected Descripcion descripcion;
    protected NombreBebida nombreBebida;



    public Bebida(BebidaId entityId, MarcaId marcaId,NombreMarca nombreMarca, RegistroId registroId,NumeroRegistro numeroRegistro, Descripcion descripcion, NombreBebida nombreBebida) {

        super(entityId);
        appendChange(new BebidaCreada(marcaId,nombreMarca, registroId,numeroRegistro,descripcion,nombreBebida)).apply();
        subscribe(new BebidaEventChange(this));


    }

    public void cambiarValorNumeroRegistro(RegistroId registroId, NumeroRegistro numeroNew){
        appendChange(new NumeroRegistroCambiado(registroId,numeroNew)).apply();
    }

    public void cambiarValorNombreMarca(MarcaId marcaId,NombreMarca marcaNew){
        appendChange(new NombreMarcaCambiado(marcaId,marcaNew)).apply();
    }


    public Bebida(BebidaId id) {
        super(id);
        subscribe(new BebidaEventChange(this));
    }

    public static Bebida from(BebidaId id, List<DomainEvent> events){
        var bebida = new Bebida((id));
        events.forEach(bebida::applyEvent);
        return bebida;
    }


}
