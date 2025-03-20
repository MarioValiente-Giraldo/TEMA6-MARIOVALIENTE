package colegio;

public record TutorLegal(String nombre,Alumno[]hijos) implements CalificacionListener {
    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        for (int i = 0; i< this.hijos().length; i++){
            if (this.hijos[i].equals(a)){

            }
        }
    }
}
