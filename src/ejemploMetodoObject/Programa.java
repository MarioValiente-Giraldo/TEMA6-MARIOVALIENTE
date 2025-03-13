package ejemploMetodoObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<PuestoTrabajador> puestoTrabajadors = new ArrayList<>(List.of(
                new PuestoTrabajador("Programador",2500),
                new PuestoTrabajador("Administrativo", 2000),
                new PuestoTrabajador("Conserje",2000)
        ));
        for (PuestoTrabajador x : puestoTrabajadors){
            System.out.println(x);
        }
        PuestoTrabajador y = new PuestoTrabajador("Porgramador",2500);
        System.out.println(puestoTrabajadors.contains(y));

        Collections.sort(puestoTrabajadors);
        for (PuestoTrabajador x : puestoTrabajadors){
            System.out.println(x.toString());
        }
    }
}
