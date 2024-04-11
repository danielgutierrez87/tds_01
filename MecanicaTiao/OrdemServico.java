import java.util.ArrayList;

public class OrdemServico {
    
    private Double total = .0;
    private Cliente cliente;
    private Veiculo veiculo;
    private ArrayList<Servico> servicos = new ArrayList<Servico>();
    
    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addTotal(Double total) {
        this.total += total;
    }
    public Double getTotal() {
        return this.total;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Servico getServico(Integer index) {
        return this.servicos.get(index);
    }
    public void addServico(Servico servico) {
        this.servicos.add(servico);
        this.addTotal(servico.getValor());
    }

    public void imprimir() {
        // "@edtsz ➜ /workspaces/tds_01/ederson/Mecanicaria (main) $ java Mecanicaria";
        System.out.println("                           Ordem de Serviço Nº                           ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("Cliente  : %62s\n", this.getCliente().getNome());
        System.out.printf("CPF      : %62s\n", this.getCliente().getCpf());
        System.out.printf("Contato  : %62s\n", this.getCliente().getContato());
        System.out.printf("Endereço : %62s\n", this.getCliente().getEndereco());
        System.out.println("");
        System.out.printf("Veículo     : %59s\n", this.getVeiculo().getDescricao());
        System.out.printf("Ano / Placa : %59s\n", this.getVeiculo().getAno() + "/" + this.getVeiculo().getPlaca());
        System.out.println("");
        System.out.println("                                 Serviço                                 ");
        System.out.println("-------------------------------------------------------------------------");
        for(int i = 0; i < this.servicos.size(); i++) {
            System.out.print(this.servicos.get(i).getDescricao());
            System.out.print(" : ");
            Integer padding = 73 - (this.servicos.get(i).getDescricao().length() + 3);
            System.out.printf("%"+padding+".2f\n", this.servicos.get(i).getValor());
        }
        System.out.println("");
        System.out.printf("%73.2f\n", this.getTotal());
        System.out.println("-------------------------------------------------------------------------");
    }
}
