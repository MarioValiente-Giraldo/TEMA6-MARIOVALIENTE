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
    @Override
    public String generarContraseña(int longiutd){
        String contraseña;
        do {
            contraseña = super.generarContraseña(longiutd);
        } while (contraseñasGeneradas.contains(contraseña));
        this.contraseñasGeneradas.add(contraseña);
        return contraseña;
    }
    @Override
    public String generarContraseña(){
        String contraseña = this.generarContraseña(12);
        return contraseña;
    }

}
