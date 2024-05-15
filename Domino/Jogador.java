import java.util.ArrayList;

public class Jogador {
    private String name;
    private ArrayList<Peca> pecasNaMao = new ArrayList<>();

    public Jogador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pegarPeca(Peca p){
        this.pecasNaMao.add(p);
    }
}
