package efectosEspeciales;

public class EfectoFactory {
    public static EfectoEspecial getEfecto(TipoEfecto tipoEfecto){
        EfectoEspecial efectoEspecial = null;
        switch (tipoEfecto){
            case MAYUSCULA ->{
                efectoEspecial = new EfectoMayuscula();
            }
            case INVERSO -> {
                efectoEspecial = new EfectoInverso();
            }
            case CORCHETES -> {
                efectoEspecial = new EfectoCorchetes();
            }
            case GUIONES ->{
                efectoEspecial = new EfectoGuiones();
            }

        }
        return efectoEspecial;
    }
}
