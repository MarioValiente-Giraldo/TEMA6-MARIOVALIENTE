package colegio;

public enum Valoracion {
    MUY_DEFICIENTE, INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE;
    public boolean esAprobado(){
        return this !=Valoracion.MUY_DEFICIENTE && this !=INSUFICIENTE;
    }
    public boolean esSuspenso(){
        return this == Valoracion.MUY_DEFICIENTE || this == INSUFICIENTE;
    }
}
