package efectosEspeciales;

public class EfectoCorchetes implements Simetrico, EfectoEspecial {
    EfectoCorchetes(){
        System.out.println("Creado efecto especial "+this.getNombre());
    }

    @Override
    public String getNombre() {
        return "Envoltura de corchetes";
    }

    @Override
    public String aplicarEfecto(String frase) {
        String aux = "";
        if (frase.startsWith("[") && frase.endsWith("]")){
            aux = frase.substring(1,frase.length()-1);
        } else if (frase.startsWith("[")) {
            aux = frase.substring(1);
        } else if (frase.endsWith("]")) {
            aux = frase.substring(0,frase.length()-1);
        }else {
            aux = "["+frase+"]";
        }
        return aux;
    }
}
