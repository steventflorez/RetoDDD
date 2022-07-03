package logicaVenta.values;

import co.com.sofka.domain.generic.ValueObject;

public class NombreEmpleado implements ValueObject<String> {
    private final String value;

    public NombreEmpleado(String value) {
        this.value = value;
    }

    public NombreEmpleado CambiarNombreEmpleado(String nombreEmpleado){return new NombreEmpleado(nombreEmpleado);}


    @Override
    public String value() {
        return value;
    }
}
