package colegio;

public class prgrama {
    public static void main(String[] args) {
        String nombreColegio = "IES Granada Capital";

        DirectorColegio director = new DirectorColegio("Antonio", nombreColegio);

        JefeEstudios jefeEstudios = new JefeEstudios("Alberto", nombreColegio);

        Profesor profesorMatematicas = new Profesor("Luis", "Matemáticas");
        Profesor profesorHistoria = new Profesor("Juan", "Historia");

        Alumno alumnoAna = new Alumno("Ana");
        Alumno alumnoRafael = new Alumno("Rafael");
        Alumno alumnoJorge = new Alumno("Jorge");

        TutorLegal tutorJulia = new TutorLegal("Julia", new Alumno[] {alumnoAna, alumnoRafael});
        TutorLegal tutorJaime = new TutorLegal("Jaime", new Alumno[] {alumnoJorge});

        profesorMatematicas.addCalificacionListener(director);
        profesorMatematicas.addCalificacionListener(jefeEstudios);
        profesorMatematicas.addCalificacionListener(tutorJulia);
        profesorHistoria.addCalificacionListener(director);
        profesorHistoria.addCalificacionListener(jefeEstudios);
        profesorHistoria.addCalificacionListener(tutorJulia);
        profesorHistoria.addCalificacionListener(tutorJaime);
        profesorHistoria.addCalificacionListener(alumnoJorge);
        profesorMatematicas.addCalificacionListener(alumnoRafael);
        profesorHistoria.addCalificacionListener(alumnoAna);
        profesorMatematicas.addCalificacionListener(alumnoAna);



        profesorMatematicas.calificar(alumnoAna, 10);
        profesorHistoria.calificar(alumnoAna, 4);
        profesorMatematicas.calificar(alumnoRafael, 3);
        profesorHistoria.calificar(alumnoJorge, 2);




        System.out.println("Nota media de Ana: " + alumnoAna.getNotaMedia());
        System.out.println("Nota media de Rafael: " + alumnoRafael.getNotaMedia());
        System.out.println("Nota media de Jorge: " + alumnoJorge.getNotaMedia());
        System.out.println("Nota media del colegio: " + director.getNotaMediaColegio());
        System.out.println("Suspensos en Matemáticas: " + jefeEstudios.getNumeroSuspensos("Matemáticas"));
        System.out.println("Suspensos en Historia: " + jefeEstudios.getNumeroSuspensos("Historia"));

    }
}
