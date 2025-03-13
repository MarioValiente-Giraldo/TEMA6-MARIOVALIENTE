package ejemploMetodoObject;

import java.util.Objects;

public class PuestoTrabajador  implements Comparable<PuestoTrabajador>{
    private String descripcion;
    private int sueldo;

    public PuestoTrabajador(String descripcion, int sueldo){
        this.descripcion = descripcion;
        this.sueldo = sueldo;
    }

    public String descripcion(){
        return this.descripcion;
    }
    public int sueldo(){
        return this.sueldo;
    }
    @Override
    public String toString(){
        return this.descripcion +" - "+this.sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PuestoTrabajador that)) return false;
        return sueldo == that.sueldo && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, sueldo);
    }

    @Override
    public int compareTo(PuestoTrabajador o) {
        //return this.sueldo - o.sueldo;
        return this.descripcion.compareTo(o.descripcion);

    }
}
