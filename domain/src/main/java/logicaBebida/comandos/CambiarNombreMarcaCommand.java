package logicaBebida.comandos;

import co.com.sofka.domain.generic.Command;
import logicaBebida.values.BebidaId;
import logicaBebida.values.MarcaId;
import logicaBebida.values.NombreMarca;

public class CambiarNombreMarcaCommand extends Command {
    private final BebidaId bebidaId;
    public final MarcaId marcaId;
    private final NombreMarca nombreMarca;

    public CambiarNombreMarcaCommand(BebidaId bebidaId, MarcaId marcaId, NombreMarca nombreMarca) {
        this.bebidaId = bebidaId;
        this.marcaId = marcaId;
        this.nombreMarca = nombreMarca;
    }

    public BebidaId getBebidaId() {
        return bebidaId;
    }

    public MarcaId getMarcaId() {
        return marcaId;
    }

    public NombreMarca getNombreMarca() {
        return nombreMarca;
    }
}
