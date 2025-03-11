package equipoFutbol;

import java.lang.management.ManagementPermission;

public class Empleado implements Nombrable {
    private String nombre;
    private double sueldo;
    private double dinero;
    public Empleado (String n, double s){
        this.nombre=n;
        this.dinero=0;
        this.sueldo = s;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public double getDinero(){
        return this.dinero;
    }
    public void cobrar(double cantidad) throws CabreoException {
        if (cantidad<this.sueldo){
            throw new CabreoException("A "+this.getNombre()+ " no le han pagado "+this.getSueldo()+" euros");
        }
        this.dinero=this.dinero+cantidad;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
