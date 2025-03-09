package Trabajadores;

public class TrabajadorTecleante extends Trabajador{
    private int pulsacionesMinuto;
    protected Teclado teclado;
    public TrabajadorTecleante(String n,int s,int nDni, char ldni,int ppm){
        super(n,s,nDni,ldni);
        this.pulsacionesMinuto = ppm;
        this.teclado = null;
    }
    public void setTeclado(Teclado t){
        this.teclado = t;
    }
    public Teclado getTeclado(){
        return this.teclado;
    }
    public int getPulsacionesMinuto(){
        return this.pulsacionesMinuto;
    }
}
