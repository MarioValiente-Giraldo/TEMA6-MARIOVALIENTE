package paqueteria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EmpresaLowCost implements EmpresaPaquetería{
    private Transportista [] transportistas;
    private int siguienteTransportista;

    public EmpresaLowCost(int n){
        Random random = new Random();
        this.transportistas = new Transportista[n];
        this.siguienteTransportista = 1;

        for(int i = 0; i<n; i++){
            this.transportistas[i]= new Transportista(random.nextInt(40,81));
        }
    }

    @Override
    public void registrarPedido(Paquete p) {
        this.transportistas[siguienteTransportista].subirCamion(p);
        this.siguienteTransportista++;
        if (this.siguienteTransportista>this.transportistas.length){
            throw new IllegalArgumentException("Limite de transportistas superado");
        }
    }

    @Override
    public List<Transportista> getTransportistas() {
        return List.of(this.transportistas);
    }
}
