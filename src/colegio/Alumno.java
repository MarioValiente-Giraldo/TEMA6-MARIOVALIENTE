package colegio;

import java.util.ArrayList;
import java.util.List;

public record Alumno(String nombre, List<Nota> notas) implements CalificacionListener {
    public Alumno(String nombre){
        this(nombre,new ArrayList<>());
    }
    public double getNotaMedia(){
        double notaTotal = 0;
        for (Nota x : this.notas){
            notaTotal += x.valorNumerico();
        }
        return notaTotal/this.notas.size();
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        if (this.nombre.equals(a.nombre)){
            this.notas.add(nota);
        }
    }
}
