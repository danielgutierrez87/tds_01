import java.time.LocalDateTime;

public class Servicos{

    private double valor;
    private String descricao;
    private LocalDateTime data = LocalDateTime.now();
    private String tempo;

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public LocalDateTime getData(){
        return this.data;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setTempo(String tempo){
        this.tempo = tempo;
    }

    public String getTempo(){
        return this.tempo;
    }
    
}

