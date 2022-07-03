package logicaVenta.values;

import co.com.sofka.domain.generic.ValueObject;

public class DescripcionVenta implements ValueObject<String> {
    private final String value;

    public DescripcionVenta(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
