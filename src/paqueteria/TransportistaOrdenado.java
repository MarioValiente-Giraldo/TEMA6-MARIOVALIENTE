package paqueteria;

import java.util.*;

public class TransportistaOrdenado extends Transportista{

    public TransportistaOrdenado(long te){
        super(te);

    }
    public void subirCamion(Paquete p){
        this.paquetes.add(p);
    }
    @Override
    public void enviar(){
        Collections.sort(this.paquetes);
        super.enviar();
    }


}
