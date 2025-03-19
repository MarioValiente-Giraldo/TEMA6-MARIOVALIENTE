package animale;

import java.util.Objects;

public abstract class Animal {
    private String nombre;
    private int peso;
    private boolean encerrado;

    public Animal(String n, int p){
        this.nombre = n;
        this.peso = p;
        this.encerrado = false;
    }
    public String getNombre(){
        return this.nombre;
    }

    public int getPeso(){
        return this.peso;
    }

    public boolean isEncerrado(){
        return this.encerrado;
    }

    void setEncerrado(boolean b){
        this.encerrado = b;
    }

    @Override
    public String toString(){
        return this.nombre +" :"+ this.peso;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(nombre, animal.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public abstract void emitirSonido();
}

