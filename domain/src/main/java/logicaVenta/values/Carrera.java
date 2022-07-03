package logicaVenta.values;

import co.com.sofka.domain.generic.ValueObject;

public class Carrera implements ValueObject<Integer> {
    private final Integer value;

    public Carrera(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return null;
    }
}
