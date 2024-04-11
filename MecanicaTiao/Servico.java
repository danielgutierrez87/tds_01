import java.time.LocalDateTime;

public class Servico {
    private Double valor;
    private String descricao;
    private LocalDateTime data = LocalDateTime.now();

    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Double getValor() {
        return this.valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}

