package Edificios;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Hotel extends Edificio{
    private List<String>clientes;
    private int maximo;
    public Hotel(String d,int np, int m){
        super(d,np);
        this.clientes = new ArrayList<>();
        this.maximo = m;
        if (m<0){
            throw new IllegalArgumentException("La cantidad máxima no puede ser negativa");
        }
    }
    public void añadirCliente(String c){
        if (this.clientes.size()==this.maximo){
            throw new IllegalStateException("Límete máximo superado");
        }
        this.clientes.add(c);

    }
    public void retirarCliente(String c){
        if (!this.clientes.contains(c)){
            throw new NoSuchElementException("No se encuentra el cliente en la lista");
        } else if (this.clientes.size()<1) {
            throw new IllegalArgumentException("No se puede retirar, la capacidad minima no puede ser menor a 1 ");
        }
        this.clientes.remove(c);

    }
}
