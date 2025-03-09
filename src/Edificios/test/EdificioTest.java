package Edificios.test;

import Edificios.CasaRural;
import Edificios.Rascacielos;
import org.junit.Test;

import static org.junit.Assert.*;

public class EdificioTest {
    @Test
    public void test1(){
        Rascacielos rascacielos = new Rascacielos("Calle Albodón S/N",90);
        assertEquals(280,rascacielos.getAltura());
    }
    @Test(expected = java.lang.IllegalStateException.class)
    public void test2(){
        CasaRural casaRural= new CasaRural("Calle Granada");
        for (int i = 0; i<7; i++){
            casaRural.añadirCliente("Persona"+i);
        }
        fail("Ha saltado otra excepcion");

    }

}