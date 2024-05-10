import java.util.ArrayList;
import java.util.random;

public class Jogador {
    private String name;
    private ArrayList<Peca> pecaDaMao = new ArrayList<>();
    private Mesa mesa;

    public Jogador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public function pescar() {

    }

    public function jogar() {
        this.pecaDaMao.add(mesa);
    }
}
