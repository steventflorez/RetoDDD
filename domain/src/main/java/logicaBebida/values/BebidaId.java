package logicaBebida.values;

import co.com.sofka.domain.generic.Identity;

public class BebidaId extends Identity {

    public BebidaId(String uuid){super(uuid);}


    public BebidaId(){

    }
    public static BebidaId of(String id){return new BebidaId(id);}

}
