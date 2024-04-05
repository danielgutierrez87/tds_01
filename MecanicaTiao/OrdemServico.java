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
    }

    public void status() {
        System.out.println("_________________________________");
        System.out.println("CLIENTE");
        System.out.println("_________________________________");
        System.err.println("Nome do cliente: " + this.getCliente().getNome());
        System.out.println("Endereço: " + this.getCliente().getEndereco());
        System.out.println("CPF: " + this.getCliente().getCpf());
        System.out.println("Contato: " + this.getCliente().getContato());
        System.out.println("__________________________________");
        System.out.println("VEÍCULO");
        System.out.println("__________________________________");
        System.out.println("Descrição: " + this.getVeiculo().getDescricao());
        System.out.println("Placa: " + this.getVeiculo().getPlaca());
        System.out.println("Ano do veículo: " + this.getVeiculo().getAno());
        System.out.println("___________________________________");
        System.out.println("SERVIÇO");
        System.out.println("___________________________________");
            for (int i = 0; i < this.servico.size; i++) {
                System.out.print(this.servico.get(i).getDescricao());
                System.out.print(" : ");
                Integer padding = 73 - (this.servico.get(i).getDescricao().length() + 3);
                System.out.printf("%"+padding+ "");
            }

        System.out.println("Valor do serviço: " + this.getServico().getValor());
        System.out.println("Descrição do serviço: " + this.getServico().getDescricao());
        System.out.println("___________________________________");
        
    }
}
