package logicaBebida.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroRegistro implements ValueObject<Integer> {

    private final Integer numeroRegistro;

    public NumeroRegistro(Integer numeroRegistro) {

        if (numeroRegistro < 10) {
            throw new IllegalArgumentException("Numero demaciado corto");
        }
        if (numeroRegistro > 1000) {
            throw new IllegalArgumentException("Numero demaciado largo");
        }
        this.numeroRegistro = Objects.requireNonNull(numeroRegistro);
    }
    public NumeroRegistro CambiarNumeroRegistro(Integer numeroRegistro){
        return new NumeroRegistro(numeroRegistro);
    }


    @Override
    public Integer value() {
        return numeroRegistro;
    }
}
