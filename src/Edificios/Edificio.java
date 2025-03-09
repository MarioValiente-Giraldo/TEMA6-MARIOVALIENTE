package Edificios;

public class Edificio {
    private String direccion;
    private int numeroPlantas;
    public Edificio (String d,int np){
        this.direccion = d;
        this.numeroPlantas = np;
        if (this.numeroPlantas<0){
            throw new IllegalArgumentException("El número de plantas no puede ser negativa");
        }
    }
    public String getDireccion(){
        return this.direccion;
    }
    public int getNumeroPlantas(){
        return this.numeroPlantas;
    }
}
