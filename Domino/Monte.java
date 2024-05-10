import java.util.ArrayList;


public class Monte {
    private ArrayList<Peca> pecas;

    public Monte() {
        this.pecas = new ArrayList<>();
        this.popular();
    }

    public void popular() {
        for (int n1 = 0; n1 < 7; n1++) {
            for(int n2 = 1; n2 < 7; n2++) {
                this.pecas.add(new Peca( n1, n2));
            } 
        }
    }

    public Peca pegarPecaDoMonte() {
        return pecas.remove(random.nextInt());
    }
}
