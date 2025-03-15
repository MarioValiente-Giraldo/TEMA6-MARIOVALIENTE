package paqueteria;

public class Paquete {
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
        if (pri<0 || pri>3){
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
}
