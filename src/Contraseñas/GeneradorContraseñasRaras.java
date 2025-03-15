package Contraseñas;

import java.util.Random;

public class GeneradorContraseñasRaras extends GeneradorContraseñasUnica{
    public GeneradorContraseñasRaras(){
        super();
    }
    public GeneradorContraseñasRaras(Random r){
        super(r);
    }
    @Override
    public String generarContraseña(int longitud){
        String contraseña = super.generarContraseña(longitud);
        StringBuilder contraseñaRara = new StringBuilder();
        for (char x : contraseña.toCharArray()){
            contraseñaRara.append((char) (x + 122));
        }
        return contraseñaRara.toString();
    }
}
