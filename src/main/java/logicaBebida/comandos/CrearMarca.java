package logicaBebida.comandos;

import co.com.sofka.domain.generic.Command;
import logicaBebida.values.MarcaId;
import logicaBebida.values.NombreMarca;

public class CrearMarca extends Command {

    private final MarcaId marcaId;
    private final NombreMarca marca;

    public CrearMarca(MarcaId marcaId, NombreMarca marca) {
        this.marcaId = marcaId;
        this.marca = marca;
    }



}
