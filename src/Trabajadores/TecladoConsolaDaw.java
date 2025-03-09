package Trabajadores;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

public class TecladoConsolaDaw implements Teclado{
    private CapaTexto ct;
    public TecladoConsolaDaw (CapaTexto ct){
        this.ct = ct;
    }
    @Override
    public void escribirTexto(String c) {
        this.ct.print(c);
    }
}
