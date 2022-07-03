package logicaVenta.values;

import co.com.sofka.domain.generic.Identity;


public class LocalId extends Identity {
    public LocalId(String uuid){super(uuid);}

    public LocalId(){

    }
    public static LocalId of(String id){return new LocalId(id);}
}
