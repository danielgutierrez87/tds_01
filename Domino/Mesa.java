import java.util.ArrayList;

public class Mesa {
    private Monte monte;
    private ArrayList<Jogador> jogador = new ArrayList<>();
    private int turno;

    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    } 

    public void distribuirPecas() {
        for(int j = 0; j < 7; j++) {
            for (int i = 0; i < this.jogador.size(); i++) {
                this.jogador.get(i).pegarPeca(this.monte.pegarPecaDoMonte());
            }
        }
    }
}
