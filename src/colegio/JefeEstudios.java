package colegio;

import java.util.HashMap;
import java.util.Map;

public class JefeEstudios extends EmpleadoColegio{
    private Map<String,Integer> notasAsignaturas;

    public JefeEstudios(String nombre, String colegio) {
        super(nombre, colegio);
        this.notasAsignaturas = new HashMap<>();
    }
    public int getNumeroSuspensos(String asignatura){
        return this.notasAsignaturas.get(asignatura);
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        if (nota.getValoracion().esSuspenso()){
            String asignatura = p.getAsignatura();
            if (this.notasAsignaturas.containsKey(asignatura)) {
                this.notasAsignaturas.put(asignatura, this.notasAsignaturas.get(asignatura) + 1);
            } else {
                this.notasAsignaturas.put(asignatura, 1);
            }        }
    }
}
