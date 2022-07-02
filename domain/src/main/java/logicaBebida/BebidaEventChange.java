package logicaBebida;

import co.com.sofka.domain.generic.EventChange;
import logicaBebida.eventos.BebidaCreada;
import logicaBebida.eventos.NumeroRegistroCambiado;
import logicaBebida.values.*;

public class BebidaEventChange extends EventChange {
    public BebidaEventChange(Bebida bebida) {
        apply((BebidaCreada event) ->{
            bebida.marca=new Marca(event.getMarcaId(),event.getNombreMarca());
            bebida.nombreBebida = event.getNombreBebida();
            bebida.descripcion = event.getDescripcion();
            bebida.registro = new Registro(event.getRegistroId(),event.getNumeroRegistro());


        });
        apply((NumeroRegistroCambiado event) ->{
           bebida.registro.ModificarNumeroRegistro(event.getNumeroNew());

        });

    }

}
