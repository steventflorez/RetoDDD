package logicaCliente.values;

import co.com.sofka.domain.generic.ValueObject;
import logicaBebida.values.NumeroRegistro;
import logicaCliente.ClienteTipo;

import java.util.Objects;

public class TipoCliente implements ValueObject<String> {
    private final String tipocliente;

    public TipoCliente(String tipocliente) {
        if(tipocliente.length()<5){
            throw new IllegalArgumentException("Nombre muy corto");
        }

        if(tipocliente.length()>20){
            throw new IllegalArgumentException("Nombre muy largo");
        }

        this.tipocliente = Objects.requireNonNull(tipocliente);
    }
    public TipoCliente CambiarTipoCliente(String tipocliente ){
        return new TipoCliente(tipocliente);
    }


    @Override
    public String value() {
        return tipocliente;
    }
}
