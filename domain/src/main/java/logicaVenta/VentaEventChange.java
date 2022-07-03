package logicaVenta;

import co.com.sofka.domain.generic.EventChange;
import logicaBebida.Bebida;
import logicaCliente.Cliente;
import logicaCliente.eventos.TipoClienteCambiado;
import logicaVenta.eventos.VentaCreada;


public class VentaEventChange extends EventChange {
    public VentaEventChange(Venta venta) {
        apply((VentaCreada event) ->{

            venta.cliente = new Cliente(event.getClienteId());
            venta.bebida = new Bebida(event.getBebidaId());
            venta.empleado = new Empleado(event.getEmpleadoId(),event.getNombreEmpleado());
            venta.local = new Local(event.getLocalId(),event.getCalle(),event.getCarrera(),event.getNomenclatura());
            venta.cantidad = event.getCantidad();

        });
        apply((NombreEmpleadoCambiado event) ->{
            venta.empleado.ModificarNombreEmpleado(event.getNombreEmpleado());

        });

    }
}
