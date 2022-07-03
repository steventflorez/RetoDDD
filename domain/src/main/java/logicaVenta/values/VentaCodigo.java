package logicaVenta.values;

import co.com.sofka.domain.generic.ValueObject;

public class VentaCodigo implements ValueObject<Integer> {
    private final Integer value;

    public VentaCodigo(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
