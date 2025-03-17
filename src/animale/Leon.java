package animale;

import java.util.Objects;

public class Leon extends Animal{
    public Leon(String n, int peso){
        super(n,peso);
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Leon leon)) return false;
        return Objects.equals(leon.getNombre(), super.getNombre());
    }
    @Override
    public void emitirSonido() {
        System.out.println("El leon "+this.getNombre()+" ruge");
    }
}
