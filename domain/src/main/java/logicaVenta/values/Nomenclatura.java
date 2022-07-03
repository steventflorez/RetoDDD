package logicaVenta.values;

import co.com.sofka.domain.generic.ValueObject;

public class Nomenclatura implements ValueObject<Integer> {
    private final Integer value;

    public Nomenclatura(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return null;
    }
}
