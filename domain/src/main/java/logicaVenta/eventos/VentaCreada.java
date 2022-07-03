package logicaVenta.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import logicaBebida.values.BebidaId;
import logicaCliente.values.ClienteId;
import logicaVenta.values.*;

public class VentaCreada extends DomainEvent {
    private final ClienteId clienteId;
    private final BebidaId bebidaId;
    private final EmpleadoId empleadoId;
    private final NombreEmpleado nombreEmpleado;
    private final LocalId localId;
    private final Calle calle;
    private final Carrera carrera;
    private final Nomenclatura nomenclatura;
    private final Cantidad cantidad;

    public VentaCreada(ClienteId clienteId, BebidaId bebidaId, EmpleadoId empleadoId, NombreEmpleado nombreEmpleado, LocalId localId, Calle calle, Carrera carrera, Nomenclatura nomenclatura, Cantidad cantidad) {
        super("logicaVenta.eventos.VentaCreada");
        this.clienteId = clienteId;
        this.bebidaId = bebidaId;
        this.empleadoId = empleadoId;
        this.nombreEmpleado = nombreEmpleado;
        this.localId = localId;
        this.calle = calle;
        this.carrera = carrera;
        this.nomenclatura = nomenclatura;
        this.cantidad = cantidad;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public BebidaId getBebidaId() {
        return bebidaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public NombreEmpleado getNombreEmpleado() {
        return nombreEmpleado;
    }

    public LocalId getLocalId() {
        return localId;
    }

    public Calle getCalle() {
        return calle;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public Nomenclatura getNomenclatura() {
        return nomenclatura;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
