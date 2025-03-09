package Trabajadores;

public class Administrativo extends TrabajadorTecleante{
    public Administrativo(String n,int s, int ndni,char ldni, int ppm){
        super(n,s,ndni,ldni,ppm);
    }
    public void escribirInforme(String t){
        this.teclado.escribirTexto(t);
    }
}
