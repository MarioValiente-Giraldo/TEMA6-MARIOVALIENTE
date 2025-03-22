package colegio;

import java.util.IllegalFormatCodePointException;

public record TutorLegal(String nombre, Alumno[]hijos) implements CalificacionListener {
    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
            for (Alumno x : this.hijos){
                if (x.equals(a)){
                    if (nota.getValoracion().esAprobado()){
                        System.out.println("Bien hecho " + a.nombre() + ", has sacado un " + nota.valorNumerico() + " en " + p.getAsignatura());
                    }else if (nota.getValoracion().esSuspenso()){
                        System.out.println("Muy mal " + a.nombre() + ", has suspendido " + p.getAsignatura()+ " y te voy a castigar");
                    }
                }
            }
    }
}
