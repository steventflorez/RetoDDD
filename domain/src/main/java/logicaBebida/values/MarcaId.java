package logicaBebida.values;

import co.com.sofka.domain.generic.Identity;

public class MarcaId extends Identity {

    public MarcaId(String uuid){super(uuid);}


    public MarcaId(){

    }
    public static MarcaId of(String id){return new MarcaId(id);}
}
