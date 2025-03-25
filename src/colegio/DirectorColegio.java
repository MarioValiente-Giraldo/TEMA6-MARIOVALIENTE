package colegio;

import java.util.ArrayList;
import java.util.List;

public class DirectorColegio extends EmpleadoColegio{
    private List<Nota> notasColegio;
    public DirectorColegio(String nombre, String colegio) {
        super(nombre, colegio);
        this.notasColegio = new ArrayList<>();
    }

    public double getNotaMediaColegio(){
        double sumaNotas = 0;
        for(Nota x : this.notasColegio){
            sumaNotas+= x.valorNumerico();
        }
        return sumaNotas/this.notasColegio.size();
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        this.notasColegio.add(nota);
    }
}
