package efectosEspeciales;

public class EfectoInverso implements EfectoEspecial, Simetrico{
    EfectoInverso(){
        System.out.println("Creando el efecto especial "+this.getNombre());
    }
    @Override
    public String getNombre() {
        return "Inversión de letras";
    }

    @Override
    public String aplicarEfecto(String frase) {
        StringBuilder stringBuilder = new StringBuilder(frase);
        return stringBuilder.reverse().toString();
    }
}
