package paqueteria;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

public class Transportista {
    private List<Paquete> paquetes;
    private long tiempoEntrega;
    public Transportista(long te){
        this.paquetes = new ArrayList<>();
        this.tiempoEntrega = te;
    }
    public void subirCamion (Paquete p){
        this.paquetes.add(p);
    }
    public void enviar(){
        for (Paquete x : this.paquetes){
            try {
                Thread.sleep((this.tiempoEntrega / 60) * 1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("El paquete "+x.getProducto()+" con prioridad "+x.getPrioridad()+" ha llegado a "+x.getDireccionDestino());

        }
    }
}
