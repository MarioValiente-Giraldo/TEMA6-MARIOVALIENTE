package Contraseñas;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeneradorContraseñasUnica extends GeneradorContraseñas{
    private Set<String> contraseñasGeneradas;

    public GeneradorContraseñasUnica(){
        super();
        this.contraseñasGeneradas = new HashSet<>();
    }
    public GeneradorContraseñasUnica(Random r){
        super(r);
        this.contraseñasGeneradas = new HashSet<>();
    }

    public String generarContraseña(int longiutd){
        String contraseña;
        do {
            contraseña = super.generadorContraseña(longiutd);
        } while (contraseñasGeneradas.contains(contraseña));
        this.contraseñasGeneradas.add(contraseña);
        return contraseña;
    }
    public String generarContraseña(){
        return this.generarContraseña(12);
    }

}
