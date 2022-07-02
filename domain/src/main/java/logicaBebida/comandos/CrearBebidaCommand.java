package logicaBebida.comandos;

import co.com.sofka.domain.generic.Command;
import logicaBebida.values.*;

public class CrearBebidaCommand extends Command {
    private final BebidaId bebidaId;
    private final MarcaId marcaId;
    private final NombreMarca nombreMarca;
    private final RegistroId registroId;
    private final NumeroRegistro numeroRegistro;
    private final Descripcion descripcion;
    private final NombreBebida nombreBebida;
//(BebidaId entityId, MarcaId marcaId,NombreMarca nombreMarca, RegistroId registroId,NumeroRegistro numeroRegistro, Descripcion descripcion, NombreBebida nombreBebida
    public CrearBebidaCommand(BebidaId bebidaId, MarcaId marcaId, NombreMarca nombreMarca, RegistroId registroId, NumeroRegistro numeroRegistro, Descripcion descripcion, NombreBebida nombreBebida) {
        this.bebidaId = bebidaId;
        this.marcaId = marcaId;
        this.nombreMarca = nombreMarca;
        this.registroId = registroId;
        this.numeroRegistro = numeroRegistro;
        this.descripcion = descripcion;
        this.nombreBebida = nombreBebida;
    }

    public NombreMarca getNombreMarca() {
        return nombreMarca;
    }

    public NumeroRegistro getNumeroRegistro() {
        return numeroRegistro;
    }

    public BebidaId getBebidaId() {
        return bebidaId;
    }

    public MarcaId getMarcaId() {
        return marcaId;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public NombreBebida getNombreBebida() {
        return nombreBebida;
    }
}
