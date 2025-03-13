package equipoFutbol;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol implements Nombrable{
    private String nombre;
    private List<Empleado> empleados;
    private double presupuesto;
    public EquipoFutbol(String n,double p){
        this.nombre = n;
        this.presupuesto=p;
        this.empleados = new ArrayList<>();
    }
    public List<Empleado> getEmpleados(){
        return this.empleados;
    }
    public double getPresupuesto(){
        return this.presupuesto;
    }
    public void addEmpleado(Empleado e){
        if (e instanceof Entrenador ){
            for (Empleado x : this.empleados){
                if (x instanceof Entrenador){
                    throw new IllegalArgumentException("Solo puede haber un entrenador");
                }
            }
        }
        if (this.empleados.size()>25){
            throw new IllegalArgumentException("Máximo 25 miembros incluido el entrenador");
        }
        this.empleados.add(e);

    }
    public void pagarSueldoEmpleados() {
        boolean hay = true;
        double cobra = 0;
        for (int i = 0; i < this.empleados.size(); i++){
            if (hay){
                if (this.empleados.get(i) instanceof EmpleadoPrimable e){
                    if (e.esPrimado()){
                        cobra = e.getSueldo() * 1.1;
                    }else {
                        cobra = e.getSueldo();
                    }
                }else {
                    cobra = this.empleados.get(i).getSueldo();
                }
                if (cobra > this.presupuesto){
                    hay = false;
                    cobra = this.presupuesto / (this.empleados.size() - (i));
                }
            }
            try {
                this.empleados.get(i).cobrar(cobra);
                this.presupuesto -= cobra;
            }catch (CabreoException cabreoException){
                System.out.println(cabreoException.getMessage());
            }
        }
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }
}
