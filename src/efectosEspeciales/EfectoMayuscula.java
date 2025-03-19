package efectosEspeciales;

public class EfectoMayuscula implements EfectoEspecial {
    EfectoMayuscula(){
        System.out.println("Creado efecto especialc"+this.getNombre());
    }
    @Override
    public String getNombre() {
        return "Pasar a mayúsculas" ;
    }

    @Override
    public String aplicarEfecto(String frase) {
        return frase.toUpperCase();
    }
}
