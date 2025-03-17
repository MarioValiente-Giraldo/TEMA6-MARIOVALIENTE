package animale;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void test1(){
        Leon leon1 = new Leon("H",100);
        Leon leon2 = new Leon("A",50);
        Leon leon3 = new Leon("B",90);
        Leon leon4 = new Leon("C",40);
        Leon leon5 = new Leon("D",120);
        Leon leon6 = new Leon("E",180);
        assertFalse(leon1.isEncerrado());
        assertFalse(leon2.isEncerrado());
        assertFalse(leon3.isEncerrado());
        assertFalse(leon4.isEncerrado());
        assertFalse(leon5.isEncerrado());
        assertFalse(leon6.isEncerrado());

        TransporteAnimales transporteAnimales = new TransporteAnimales();
        transporteAnimales.añadir(leon1);
        transporteAnimales.añadir(leon2);
        transporteAnimales.añadir(leon3);
        transporteAnimales.añadir(leon4);
        transporteAnimales.añadir(leon5);
        transporteAnimales.añadir(leon6);

        assertEquals(6,transporteAnimales.getNumeroAnimales());
        assertEquals(580,transporteAnimales.getPesoActual());
        assertTrue(leon1.isEncerrado());
        assertTrue(leon2.isEncerrado());
        assertTrue(leon3.isEncerrado());
        assertTrue(leon4.isEncerrado());
        assertTrue(leon5.isEncerrado());
        assertTrue(leon6.isEncerrado());

    }
    @Test
    public void test2(){
        Leon leon1 = new Leon("H",100);
        Leon leon2 = new Leon("A",50);
        Leon leon3 = new Leon("B",90);
        Leon leon4 = new Leon("C",40);
        Leon leon5 = new Leon("D",120);
        Leon leon6 = new Leon("E",180);
        Leon leon7 = new Leon("N",10);
        TransporteAnimales transporteAnimales = new TransporteAnimales();
        transporteAnimales.añadir(leon1);
        transporteAnimales.añadir(leon2);
        transporteAnimales.añadir(leon3);
        transporteAnimales.añadir(leon4);
        transporteAnimales.añadir(leon5);
        transporteAnimales.añadir(leon6);
        assertFalse(transporteAnimales.añadir(leon7));
    }
    @Test
    public void test3(){
        TransporteAnimales transporteAnimales = new TransporteAnimales();
        Leon leon1 = new Leon("H",100);
        Leon leon2 = new Leon("A",50);
        transporteAnimales.añadir(leon1);
        transporteAnimales.añadir(leon2);
        Tigre tigre = new Tigre("Tigre",200);
        assertFalse(transporteAnimales.añadir(tigre));
    }

}