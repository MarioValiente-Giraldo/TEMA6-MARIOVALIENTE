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
        double totalPagar = 0;
        for (Empleado x : this.empleados) {
            if (x instanceof EmpleadoPrimable empleadoPrimable) {
                if (empleadoPrimable.esPrimado()) {
                    totalPagar += empleadoPrimable.getSueldo() * 1.1;
                } else {
                    totalPagar += empleadoPrimable.getSueldo();
                }
            } else {
                totalPagar += x.getSueldo();
            }
        }

        if (this.presupuesto >= totalPagar) {
            for (Empleado x : this.empleados) {
                double sueldoAPagar = x.getSueldo();
                if (x instanceof EmpleadoPrimable empleadoPrimable && empleadoPrimable.esPrimado()) {
                    sueldoAPagar *= 1.1;
                }
                try {
                    x.cobrar(sueldoAPagar);
                    this.presupuesto -= sueldoAPagar;
                } catch (CabreoException e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            int empleadosRestantes = this.empleados.size();
            for (Empleado x : this.empleados) {
                double sueldoRestante = this.presupuesto / empleadosRestantes;
                try {
                    x.cobrar(sueldoRestante);
                    this.presupuesto -= sueldoRestante;
                } catch (CabreoException ex) {
                    System.out.println(ex.getMessage());
                }
                empleadosRestantes--;
            }
        }
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }
}
