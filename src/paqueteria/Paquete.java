package paqueteria;

import java.util.Comparator;
import java.util.Objects;

public class Paquete implements Comparable<Paquete> {
    public static final int ALTA = 1;
    public static final int MEDIA = 2;
    public static final int BAJA = 3;
    private String producto;
    private String direccionDestino;
    private int prioridad;
    public Paquete (String pro, String dd, int pri){
        this.producto = pro;
        this.direccionDestino = dd;
        this.prioridad = pri;
        if (pri<Paquete.ALTA|| pri>Paquete.BAJA){
            throw new IllegalArgumentException("Nivel de prioridad no válido");
        }
    }
    public String getProducto(){
        return this.producto;
    }
    public String getDireccionDestino(){
        return this.direccionDestino;
    }
    public int getPrioridad(){
        return prioridad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paquete paquete = (Paquete) o;
        return Objects.equals(producto, paquete.producto) && Objects.equals(direccionDestino, paquete.direccionDestino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producto, direccionDestino);
    }

    @Override
    public int compareTo(Paquete o) {
        return this.prioridad - o.prioridad;
    }
}
