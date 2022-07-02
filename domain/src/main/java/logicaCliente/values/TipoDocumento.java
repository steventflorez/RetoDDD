package logicaCliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDocumento implements ValueObject<String> {
    private final String value;

    public TipoDocumento(String value) {
        switch (value){
            case "pasaporte": case "cedula": case "cedula de extranjeria":
                break;
            default:
                throw new IllegalArgumentException("Tipo de documento no valida");
        }


        this.value = Objects.requireNonNull(value);
    }


    @Override
    public String value() {
        return value;
    }
}
