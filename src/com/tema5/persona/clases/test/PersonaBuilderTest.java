package com.tema5.persona.clases.test;

import com.tema5.persona.clases.EstadoCivil;
import com.tema5.persona.clases.Persona;
import com.tema5.persona.clases.PersonaBuilder;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaBuilderTest {
    @Test
    public void test1(){
        Persona jaime = new PersonaBuilder("Jaime","Lara","Ramos")
        .setTelefono("958000000")
        .setCiudad("Granada")
        .setEdad(15)
        .build();

        Persona juan = new PersonaBuilder("Juan","Molina","Molina")
        .setEdad(30)
        .setPais("Ecuador")
        .build();

        Persona maria = new PersonaBuilder("Maria","Garcia","Perez")
        .setEdad(30)
        .setCiudad("Almeria")
        .setPareja(juan).build();



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