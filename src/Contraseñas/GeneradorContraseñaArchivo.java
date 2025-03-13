package Contraseñas;

import java.io.File;
import java.util.Random;

public class GeneradorContraseñaArchivo extends GeneradorContraseñas{
    private File archivo;
    public GeneradorContraseñaArchivo (String ruta){
        super();
        this.archivo = new File(ruta);
    }
    public GeneradorContraseñaArchivo (String ruta, Random r){
        super(r);
        this.archivo = new File(ruta);
    }

}

