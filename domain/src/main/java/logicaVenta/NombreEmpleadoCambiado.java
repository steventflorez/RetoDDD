package logicaVenta;

import co.com.sofka.domain.generic.DomainEvent;
import logicaVenta.values.EmpleadoId;
import logicaVenta.values.NombreEmpleado;

public class NombreEmpleadoCambiado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final NombreEmpleado nombreEmpleado;

    public NombreEmpleadoCambiado(EmpleadoId empleadoId, NombreEmpleado nombreEmpleado) {
        super("logicaVenta.NombreEmpleadoCambiado");
        this.empleadoId = empleadoId;
        this.nombreEmpleado = nombreEmpleado;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public NombreEmpleado getNombreEmpleado() {
        return nombreEmpleado;
    }
}
