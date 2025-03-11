package adivinanzas;

import java.time.Duration;
import java.time.Instant;

public class Adivinanza {
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;
    public Adivinanza(String e, String rc){
        this.enunciado = e;
        this.respuestaCorrecta = rc;
        this.inicio = null;
    }
    public String getEnunciado(){
        this.inicio = Instant.now();
        return this.enunciado;
    }
    public void comprobar(String respuesta) throws AdivinanzaException{
        Instant instant = Instant.now();
        Duration duracion = Duration.between(this.inicio,instant);
        if (duracion.getSeconds() > 30 && respuesta.equals(this.respuestaCorrecta) ) {
            throw new AdivinanzaException("Has acertado pero fuera de tiempo");
        } else if (duracion.getSeconds() > 30) {
            throw new TiempoSuperadoException("Has superado el timepo límite");
        }
        else if (!respuesta.equals(this.respuestaCorrecta)) {
            throw new AdivinanzaIncorrectaException("No has acertado la adivianza");
        }
        System.out.println("Has acertado");

    }
}
