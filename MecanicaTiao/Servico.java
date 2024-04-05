import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Servico {

    private double valor;
    private LocalDateTime data = LocalDateTime.now();
    private String descricao;

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public LocalDateTime getData(){
        return this.data;
    }

    public void setDescriçao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}

