package Contraseñas;

import java.util.Random;

public class GeneradorContraseñasInvertidas extends GeneradorContraseñasUnica{
    public GeneradorContraseñasInvertidas(){
        super();
    }
    public GeneradorContraseñasInvertidas(Random r){
        super(r);
    }
    @Override
    public String generarContraseña (int longitud){
        String contraseña = super.generarContraseña(longitud);
        StringBuilder invertida = new StringBuilder();
        for (char x : contraseña.toCharArray()){
            if (Character.isUpperCase(x)){
                invertida.append(Character.toLowerCase(x));
            } else if (Character.isLowerCase(x)) {
                invertida.append(Character.toUpperCase(x));
            }else {
                invertida.append(x);
            }
        }
        return invertida.toString();
    }
}
