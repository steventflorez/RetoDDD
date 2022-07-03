package logicaVenta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.Bebida;
import logicaBebida.values.BebidaId;
import logicaCliente.Cliente;
import logicaCliente.values.ClienteId;
import logicaVenta.eventos.VentaCreada;
import logicaVenta.values.*;

import java.util.List;

public class Venta extends AggregateEvent<VentaId> {
    protected Cliente cliente;
    protected Bebida bebida;
    protected Empleado empleado;
    protected Local local;
    protected Cantidad cantidad;

    public Venta(VentaId entityId, ClienteId clienteId, BebidaId bebidaId, EmpleadoId empleadoId, NombreEmpleado nombreEmpleado, LocalId localId,Calle calle,Carrera carrera,Nomenclatura nomenclatura,Cantidad cantidad) {
        super(entityId);
        appendChange(new VentaCreada(clienteId,bebidaId,empleadoId,nombreEmpleado,localId,calle,carrera,nomenclatura,cantidad)).apply();
        subscribe(new VentaEventChange(this));
    }

    public void cambiarValorNombreEmpleado(EmpleadoId empleadoId,NombreEmpleado nombreEmpleado){
        appendChange(new NombreEmpleadoCambiado(empleadoId,nombreEmpleado)).apply();
    }

    public Venta(VentaId id){
        super(id);
        subscribe(new VentaEventChange(this));
    }
    public static Venta from(VentaId id, List<DomainEvent> events){
        var venta = new Venta((id));
        events.forEach(venta::applyEvent);
        return venta;
    }
}
