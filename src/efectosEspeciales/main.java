package efectosEspeciales;

public class main {
    public static void main(String[] args) {
        EfectoEspecial efecto1 = EfectoFactory.getEfecto(TipoEfecto.MAYUSCULA);
        EfectoEspecial efecto2 = EfectoFactory.getEfecto(TipoEfecto.INVERSO);
        EfectoEspecial efecto3 = EfectoFactory.getEfecto(TipoEfecto.CORCHETES);
        EfectoEspecial efecto4 = EfectoFactory.getEfecto(TipoEfecto.GUIONES);
        String frase = "a jugar";
        String fraseCorchete = "[a jugar]";
        System.out.println(efecto1.aplicarEfecto(frase));
        System.out.println(efecto2.aplicarEfecto(frase));
        System.out.println(efecto3.aplicarEfecto(frase));
        System.out.println(efecto3.aplicarEfecto(fraseCorchete));
        System.out.println(efecto4.aplicarEfecto(frase));
    }
}
