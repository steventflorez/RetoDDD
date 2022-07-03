package logicaVenta.values;

import co.com.sofka.domain.generic.Identity;

public class VentaId extends Identity {
    public VentaId(String uuid){super(uuid);}

    public VentaId(){

    }

    public static VentaId of(String id){return new VentaId(id);}
}
