package animale;

import java.util.HashSet;
import java.util.Set;

public abstract class ContenedorAnimales {
    protected Set<Animal> animales;

    public ContenedorAnimales(){
        this.animales = new HashSet<>();
    }
    public boolean añadir(Animal a){
        boolean resultado = false;
        if (this.comprobarDisponibilidadPlaza(a)){
            this.animales.add(a);
            a.setEncerrado(true);
            resultado = true;
        }
        return resultado;
    }
    public boolean retirarAnimal(Animal a){
        boolean resultado;
        if (this.animales.contains(a)){
            this.animales.remove(a);
            resultado = true;
        }else{
            resultado = false;
        }
        return  resultado;
    }
    public int getPesoActual(){
        int pesoTotal=0;
        for (Animal x : this.animales){
            pesoTotal+=x.getPeso();
        }
        return pesoTotal;
    }
    public int getNumeroAnimales(){
        return this.animales.size();
    }
    protected abstract boolean comprobarDisponibilidadPlaza ( Animal a);
}
