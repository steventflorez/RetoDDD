package logicaVenta.comandos;

import co.com.sofka.domain.generic.Command;
import logicaVenta.values.EmpleadoId;
import logicaVenta.values.NombreEmpleado;
import logicaVenta.values.VentaId;

public class CambiarNombreEmpleadoCommand extends Command {
    private final VentaId ventaId;
    private final EmpleadoId empleadoId;
    private final NombreEmpleado nombreEmpleado;


    public CambiarNombreEmpleadoCommand(VentaId ventaId, EmpleadoId empleadoId, NombreEmpleado nombreEmpleado) {
        this.ventaId = ventaId;
        this.empleadoId = empleadoId;
        this.nombreEmpleado = nombreEmpleado;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public NombreEmpleado getNombreEmpleado() {
        return nombreEmpleado;
    }
}
