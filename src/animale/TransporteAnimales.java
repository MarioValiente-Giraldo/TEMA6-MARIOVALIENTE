package animale;

public class TransporteAnimales extends Jaula {

    public TransporteAnimales() {
        super(6, 580);
    }
    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        boolean impostor = false;
        for (Animal x : super.animales){
            if (a.getClass() != x.getClass()){
                impostor = true;
            }
        }
        return super.getNumeroAnimales() < super.getCapacidadMaxima() && ((super.getPesoActual() + a.getPeso())) <= super.getPesoMaximo() &&  impostor == false;
    }


}
