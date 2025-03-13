package Contraseñas;

import java.util.Random;

public abstract class GeneradorContraseñas {
    private Random random;
    public GeneradorContraseñas(){
        this.random=new Random();
    }
    public GeneradorContraseñas(Random r){
        this.random = r;
    }
    public String generarContraseña(int longitud){
        String contraseña = "";
        for (int i = 0; i<longitud;i++) {
            int numeroAleatorio1 = this.random.nextInt(0, 3);
            int numeroAleatorio2 = 0;

            switch (numeroAleatorio1) {
                case 0 -> {
                    numeroAleatorio2 = this.random.nextInt(48, 58);

                }
                case 1 -> {
                    numeroAleatorio2 = this.random.nextInt(65, 91);
                }
                case 2 -> {
                    numeroAleatorio2 = this.random.nextInt(97, 122);
                }
            }
            char caracter = (char)numeroAleatorio2;
            contraseña+=caracter;
        }
        return contraseña;
    }
    public String generarContraseña(){
        return this.generarContraseña(8);

    }

}
