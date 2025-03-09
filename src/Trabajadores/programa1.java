package Trabajadores;

public class programa1 {
    public static void main(String[] args) {
        Programador programador = new Programador("Enrique",1800,22222222,'w',70);
        programador.aprenderLenguaje("Java", "System.out.println(Hola Mundo!);");
        programador.aprenderLenguaje("C","printf Hola mundo");
        TecladoJava tecladoJava = new TecladoJava();
        programador.setTeclado(tecladoJava);
        programador.getTeclado().escribirTexto(programador.programarHolaMundo("Java"));
        programador.getTeclado().escribirTexto(programador.programarHolaMundo("C"));


    }
}
