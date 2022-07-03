package logicaVenta;

import co.com.sofka.domain.generic.Entity;
import logicaVenta.values.Calle;
import logicaVenta.values.Carrera;
import logicaVenta.values.LocalId;
import logicaVenta.values.Nomenclatura;

public class Local extends Entity<LocalId> {
    private final Calle calle;
    private final Carrera carrera;
    private final Nomenclatura nomenclatura;
    public Local(LocalId entityId, Calle calle, Carrera carrera, Nomenclatura nomenclatura) {
        super(entityId);
        this.calle = calle;
        this.carrera = carrera;
        this.nomenclatura = nomenclatura;
    }
}
