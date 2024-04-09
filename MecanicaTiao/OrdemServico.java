import java.util.ArrayList;

public class OrdemServico {

    private double total; 
    private Cliente cliente;
    private Veiculo veiculo; 
    private ArrayList<Servico> servico = new ArrayList<Servico>();

    public void addTotal(double total){
        this.total += total;
    }

    public double getTotal(){
        return this.total;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo(){
        return this.veiculo;
    }

    public ArrayList<Servico> getServico() {
        return this.servico;
    }

    public void addServico(Servico servico){
        this.servico.add(servico);
        this.addTotal(servico.getValor());
    }

    public void status() {
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
            for(int i = 0; i < this.servico.size(); i++) {
                System.out.print(this.servico.get(i).getDescricao());
                System.out.print(" : ");
                Integer padding = 73 - (this.servico.get(i).getDescricao().length() + 3);
                System.out.printf("%"+padding+".2f\n", this.servico.get(i).getValor());
            }
        System.out.println("");
        System.out.printf("%73.2f\n", this.getTotal());
        System.out.println("-------------------------------------------------------------------------");
    }
}
