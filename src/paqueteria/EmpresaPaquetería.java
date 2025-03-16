package paqueteria;

import java.util.List;

public interface EmpresaPaquetería {
    public abstract void registrarPedido(Paquete p);

    public abstract List<Transportista> getTransportistas();

    public default void enviarPaquetes(){
        for (Transportista x : this.getTransportistas()){
            x.enviar();
        }
    }

}
