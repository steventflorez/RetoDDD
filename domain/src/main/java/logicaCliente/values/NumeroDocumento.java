package logicaCliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroDocumento implements ValueObject<Integer> {

    private final Integer value;

    public NumeroDocumento(Integer value) {
        if (value < 10) {
            throw new IllegalArgumentException("Numero demaciado corto");
        }
        if (value > 999999999) {
            throw new IllegalArgumentException("Numero demaciad largo");
        }
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public Integer value() {
        return null;
    }
}
