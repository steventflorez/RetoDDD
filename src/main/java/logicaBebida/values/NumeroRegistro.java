package logicaBebida.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroRegistro implements ValueObject<Integer> {

    private final Integer value;

    public NumeroRegistro(Integer value) {
        if (value < 10) {
            throw new IllegalArgumentException("Numero demaciado corto");
        }
        if (value > 10) {
            throw new IllegalArgumentException("Numero demaciado largo");
        }
        this.value = Objects.requireNonNull(value);
    }


    @Override
    public Integer value() {
        return null;
    }
}
