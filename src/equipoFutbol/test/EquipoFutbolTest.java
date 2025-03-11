package equipoFutbol.test;

import equipoFutbol.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquipoFutbolTest {
    @Test
    public void test1(){
        EquipoFutbol equipo = new EquipoFutbol("Granada CF", 1000);

        Entrenador ivan = new Entrenador("Iván", 100);
        CuerpoTecnico ana = new CuerpoTecnico("Ana", 80, "Médico");
        Futbolista pepe = new Futbolista("Pepe", 400, 7);
        Futbolista jorge = new Futbolista("Jorge", 450, 9);
        Futbolista jose = new Futbolista("Jose", 380, 10);

        pepe.primar();
        jose.primar();

        equipo.addEmpleado(ivan);
        equipo.addEmpleado(ana);
        equipo.addEmpleado(pepe);
        equipo.addEmpleado(jorge);
        equipo.addEmpleado(jose);

        equipo.pagarSueldoEmpleados();

        assertEquals(80, ana.getDinero(),0.01);
        assertEquals(440, pepe.getDinero(),0.01);
        assertEquals(190, jorge.getDinero(),0.01);
        assertEquals(190, jose.getDinero(),0.01);









    }

}