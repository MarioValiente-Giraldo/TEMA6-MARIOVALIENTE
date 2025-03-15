package paqueteria;

import java.util.List;

public interface EmpresaPaquetería {
    public abstract void registrarPedido(Paquete p);
    public abstract List<Transportista> getTransportista;
    public default void enviarPaquetes{

    }
}
