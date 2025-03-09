package Trabajadores;

public class Trabajador {
    private String dni;
    private String nombre;
    protected int sueldo;
    public Trabajador(String nombre,int sueldo,int numDNI, char letraDNI){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.dni = ""+numDNI+letraDNI;
    }
    public int getSueldo(){
        return this.sueldo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDni(){
        return this.dni;
    }
}

