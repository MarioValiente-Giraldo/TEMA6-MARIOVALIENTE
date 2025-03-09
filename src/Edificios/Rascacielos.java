package Edificios;

public class Rascacielos extends Edificio{
    private int altura;
    public Rascacielos(String d, int np){
        super(d,np);
        this.altura = 10 + (3*np);
        if (this.altura<0){
            throw new IllegalArgumentException("El valo de altura no puede ser negativo");
        }
    }
    public int getAltura(){
        return this.altura;
    }
}
