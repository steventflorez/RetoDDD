package logicaBebida.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.*;

public class BebidaCreada extends DomainEvent {


    private final MarcaId marcaId;
    private final NombreMarca nombreMarca;
    private final RegistroId registroId;
    private final NumeroRegistro numeroRegistro;
    private final Descripcion descripcion;
    private final NombreBebida nombreBebida;

    public BebidaCreada(MarcaId marcaId, NombreMarca nombreMarca, RegistroId registroId, NumeroRegistro numeroRegistro, Descripcion descripcion, NombreBebida nombreBebida) {
        super("logicaBebida.BebidaCreada");

        this.marcaId = marcaId;
        this.nombreMarca = nombreMarca;
        this.registroId = registroId;
        this.numeroRegistro = numeroRegistro;
        this.descripcion = descripcion;
        this.nombreBebida = nombreBebida;
    }

    public MarcaId getMarcaId() {
        return marcaId;
    }

    public NombreMarca getNombreMarca() {
        return nombreMarca;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public NumeroRegistro getNumeroRegistro() {
        return numeroRegistro;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public NombreBebida getNombreBebida() {
        return nombreBebida;
    }
}
