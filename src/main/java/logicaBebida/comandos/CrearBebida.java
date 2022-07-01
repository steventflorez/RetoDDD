package logicaBebida.comandos;

import co.com.sofka.domain.generic.Command;
import logicaBebida.values.*;

public class CrearBebida extends Command {
    private final BebidaId bebidaId;
    private final MarcaId marcaId;
    private final RegistroId registroId;
    private final Descripcion descripcion;
    private final NombreBebida nombreBebida;

    public CrearBebida(BebidaId bebidaId, MarcaId marcaId, RegistroId registroId, Descripcion descripcion, NombreBebida nombreBebida) {
        this.bebidaId = bebidaId;
        this.marcaId = marcaId;
        this.registroId = registroId;
        this.descripcion = descripcion;
        this.nombreBebida = nombreBebida;
    }


}
