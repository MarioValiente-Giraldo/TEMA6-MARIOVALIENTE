package efectosEspeciales;

public class EfectoGuiones implements EfectoEspecial{
    EfectoGuiones(){
        System.out.println("Creando el efecto especial "+this.getNombre());
    }
    @Override
    public String getNombre() {
        return "Separador de guiones";
    }

    @Override
    public String aplicarEfecto(String frase) {

        return frase.replace(" ","_");
    }
}
