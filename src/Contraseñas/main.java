package Contraseñas;

public class main {
    public static void main(String[] args) {
        GeneradorContraseñas generador = new GeneradorContraseñas();
        System.out.println(generador.generarContraseña());

        GeneradorContraseñaArchivo generadorContraseñaArchivo = new GeneradorContraseñaArchivo("hola.txt");
        System.out.println(generadorContraseñaArchivo.generarContraseña());

        GeneradorContraseñasUnica generadorContraseñasUnica = new GeneradorContraseñasUnica();
        System.out.println(generadorContraseñasUnica.generarContraseña());

        GeneradorContraseñasInvertidas generadorContraseñasInvertidas = new GeneradorContraseñasInvertidas();
        System.out.println(generadorContraseñasInvertidas.generarContraseña());

        GeneradorContraseñasRaras generadorContraseñasRaras = new GeneradorContraseñasRaras();
        System.out.println(generadorContraseñasRaras.generarContraseña());


    }
}
