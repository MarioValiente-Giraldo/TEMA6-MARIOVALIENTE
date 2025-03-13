package Contraseñas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    @Override
    public String generarContraseña(int longitud){
        String contraseña = super.generarContraseña(longitud);
        try {
            FileWriter fileWriter = new FileWriter(this.archivo, true);
            fileWriter.write(contraseña);
            fileWriter.write("");
            fileWriter.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return contraseña;
    }
    @Override
    public String generarContraseña(){
        String contraseña = this.generarContraseña(12);
        return contraseña;
    }

}

