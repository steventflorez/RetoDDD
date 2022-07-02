package logicaBebida.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String value;

    public Descripcion(String value) {
        if(value.length()<5){
            throw new IllegalArgumentException("La descripcion es demaciado corta");
        }

        if(value.length()>200){
            throw new IllegalArgumentException("La descripcion es demaciado Larga");
        }

        this.value = Objects.requireNonNull(value);
    }


    @Override
    public String value() {
        return value;
    }
}
