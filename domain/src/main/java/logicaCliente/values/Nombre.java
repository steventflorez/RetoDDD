package logicaCliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        if(value.length()<5){
            throw new IllegalArgumentException("Nombre muy corto");
        }

        if(value.length()>20){
            throw new IllegalArgumentException("Nombre muy largo");
        }

        this.value = Objects.requireNonNull(value);
    }


    @Override
    public String value() {
        return value;
    }
}
