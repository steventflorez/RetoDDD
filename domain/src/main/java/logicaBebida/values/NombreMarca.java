package logicaBebida.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreMarca implements ValueObject<String> {
    private final String nombreMarca;

    public NombreMarca(String nombreMarca) {
        if(nombreMarca.length()<5){
            throw new IllegalArgumentException("el nombre es demaciado corto");
        }

        if(nombreMarca.length()>20){
            throw new IllegalArgumentException("el nombre es demaciado largo");
        }

        this.nombreMarca = Objects.requireNonNull(nombreMarca);
    }

    public NombreMarca CambiarNombreMarca(String nombreMarca){
        return new NombreMarca(nombreMarca);
    }


    @Override
    public String value() {
        return nombreMarca;
    }
}
