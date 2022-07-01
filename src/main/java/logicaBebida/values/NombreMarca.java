package logicaBebida.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreMarca implements ValueObject<String> {
    private final String value;

    public NombreMarca(String value) {
        if(value.length()<5){
            throw new IllegalArgumentException("el nombre es demaciado corto");
        }

        if(value.length()<20){
            throw new IllegalArgumentException("el nombre es demaciado largo");
        }

        this.value = Objects.requireNonNull(value);
    }


    @Override
    public String value() {
        return value;
    }
}
