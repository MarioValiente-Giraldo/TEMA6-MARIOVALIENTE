package animale;

import java.util.Objects;

public class Tigre extends Animal{
    public Tigre(String n, int peso){
        super(n,peso);
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tigre tigre)) return false;
        return Objects.equals(tigre.getNombre(), super.getNombre());
    }
    @Override
    public void emitirSonido() {
        System.out.println("El tigre "+this.getNombre()+" ruge");

    }
}
