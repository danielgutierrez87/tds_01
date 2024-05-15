import java.util.ArrayList;
import java.util.Random;


public class Monte {
    private ArrayList<Peca> pecasDoMonte;

    public Monte() {
        this.pecasDoMonte = new ArrayList<>();
        this.popular();
    }

    public void popular() {
        for (int n1 = 0; n1 < 7; n1++) {
            for(int n2 = n1; n2 < 7; n2++) {
                this.pecasDoMonte.add(new Peca(n1, n2));
            } 
        }
    }

    public Peca pegarPecaDoMonte() {
        Random aleatorio = new Random();
        return pecasDoMonte.remove(aleatorio.nextInt(pecasDoMonte.size()));
    }
}
