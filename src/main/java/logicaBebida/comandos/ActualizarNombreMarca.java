package logicaBebida.comandos;

import co.com.sofka.domain.generic.Command;
import logicaBebida.values.BebidaId;
import logicaBebida.values.MarcaId;
import logicaBebida.values.NombreMarca;

public class ActualizarNombreMarca extends Command {
    private final BebidaId bebidaId;
    public final MarcaId marcaId;
    private final NombreMarca nombreMarca;

    public ActualizarNombreMarca(BebidaId bebidaId, MarcaId marcaId, NombreMarca nombreMarca) {
        this.bebidaId = bebidaId;
        this.marcaId = marcaId;
        this.nombreMarca = nombreMarca;
    }


}
