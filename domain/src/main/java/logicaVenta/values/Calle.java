package logicaVenta.values;

import co.com.sofka.domain.generic.ValueObject;

public class Calle implements ValueObject<Integer> {
    private final Integer value;

    public Calle(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return null;
    }
}
