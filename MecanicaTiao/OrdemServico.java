import java.util.ArrayList;

public class OrdemServico {

    private double total=0; 
    private Cliente cliente;
    private Veiculo veiculo; 
    private ArrayList<Servico> servico = new ArrayList<Servico>();

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    public String getServicos() {
        return servicos;
    }
    public void setServicos(String servicos) {
        this.servicos = servicos;
    }  
}
