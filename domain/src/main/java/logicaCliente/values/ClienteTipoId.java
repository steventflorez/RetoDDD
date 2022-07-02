package logicaCliente.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteTipoId extends Identity {
    public ClienteTipoId(String uuid){super(uuid);}

    public ClienteTipoId(){

    }
    public static ClienteTipoId of(String id){return new ClienteTipoId(id);}
}
