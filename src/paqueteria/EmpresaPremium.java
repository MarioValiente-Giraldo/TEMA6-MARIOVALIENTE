package paqueteria;

import java.util.List;

public class EmpresaPremium implements EmpresaPaquetería{
    private Transportista rapido;
    private Transportista medio;
    private Transportista lento;

    public EmpresaPremium(){
        this.rapido = new Transportista(10);
        this.medio = new Transportista(25);
        this.lento = new Transportista(50);
    }

    @Override
    public void registrarPedido(Paquete p) {
        switch (p.getPrioridad()){
            case 1 ->{
                this.rapido.subirCamion(p);
            }
            case 2 ->{
                this.medio.subirCamion(p);
            }
            case 3 ->{
                this.lento.subirCamion(p);
            }

        }
    }

    @Override
    public List<Transportista> getTransportistas() {
        return List.of(this.rapido,this.medio,this.lento);
    }
}
