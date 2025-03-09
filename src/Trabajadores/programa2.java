package Trabajadores;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

public class programa2 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto capaTexto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();
        TecladoConsolaDaw tecladoConsolaDaw = new TecladoConsolaDaw(capaTexto);
        Administrativo administrativo = new Administrativo("Rafa",1500,11111111,'H',100);
        administrativo.setTeclado(tecladoConsolaDaw);
        administrativo.escribirInforme("Soy Rafa");
        teclado.setTipoCursor(Teclado.CURSOR_NULO);
        teclado.leerCaracter();

    }
}


