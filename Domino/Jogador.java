import java.util.ArrayList;
public class Jogador {
    private String name;
    private ArrayList<Peca> pecaDaMao = new ArrayList<>();

    public Jogador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void iniciarJogada(Peca p){
        for (int i = 0; i < 7; i++) {
            this.pecaDaMao(p);
        }
    }

    public void jogada(Peca p){
        this.pecaDaMao.add(p);
    }
}
