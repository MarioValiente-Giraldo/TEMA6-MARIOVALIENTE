package com.tema5.persona.clases.test;

import com.tema5.persona.clases.EstadoCivil;
import com.tema5.persona.clases.Persona;
import com.tema5.persona.clases.PersonaBuilder;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaBuilderTest {
    @Test
    public void test1(){
        PersonaBuilder personaBuilder = new PersonaBuilder("Jaime","Lara","Ramos");
        personaBuilder.setTelefono("958000000");
        personaBuilder.setCiudad("Granada");
        personaBuilder.setEdad(15);
       Persona jaime =  personaBuilder.build();
        PersonaBuilder personaBuilder1 = new PersonaBuilder("Maria","Garcia","Perez");
        personaBuilder1.setEdad(30);
        PersonaBuilder pareja = new PersonaBuilder("Juan","Molina","Molina");
        pareja.setEdad(30);
        pareja.setPais("Ecuador");
        Persona juan = pareja.build();

        personaBuilder1.setCiudad("Almeria");
        personaBuilder1.setPareja(juan);
        Persona maria =  personaBuilder1.build();

        assertEquals("Granada",jaime.getDirection().ciudad());
        assertEquals(15,jaime.getEdad());
        assertEquals(EstadoCivil.SOLTERO,jaime.getEstadoCivil());
        assertEquals("Maria",maria.getNombre());
        assertEquals("España",maria.getDirection().pais());
        assertEquals(EstadoCivil.CASADO,maria.getEstadoCivil());
        assertEquals("Juan",maria.getPareja().getNombre());

        assertEquals("Ecuador",maria.getPareja().getDirection().pais());
    }

}