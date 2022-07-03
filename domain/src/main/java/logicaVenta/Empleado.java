package logicaVenta;

import co.com.sofka.domain.generic.Entity;
import logicaCliente.ClienteEventChange;
import logicaCliente.values.ClienteId;
import logicaVenta.values.EmpleadoId;
import logicaVenta.values.NombreEmpleado;
import logicaVenta.values.VentaId;

public class Empleado extends Entity<EmpleadoId>{
    private NombreEmpleado nombreEmpleado;


    public Empleado(EmpleadoId entityId, NombreEmpleado nombreEmpleado) {
        super(entityId);
        this.nombreEmpleado = nombreEmpleado;
    }

    public void ModificarNombreEmpleado(NombreEmpleado nombreNuevo){
        this.nombreEmpleado = nombreEmpleado.CambiarNombreEmpleado(nombreNuevo.value());
    }


}
