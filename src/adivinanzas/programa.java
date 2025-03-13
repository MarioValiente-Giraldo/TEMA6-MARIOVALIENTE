package adivinanzas;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Adivinanza adivinanza = new Adivinanza("Oro parece...","platano");
        System.out.println(adivinanza.getEnunciado());
        String respuesta = new Scanner(System.in).nextLine();
        try {
            adivinanza.comprobar(respuesta);

        } catch (AdivinanzaException e) {
            System.out.println(e.getMessage());
        }
    }
}
