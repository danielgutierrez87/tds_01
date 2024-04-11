import java.util.ArrayList;
public class OrdemServico{
    
    private double total = 0;
    private Cliente cliente;
    private Veiculo veiculo;
    private ArrayList<Servicos> servico = new ArrayList<>();

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

    public void addServico(Servicos servico){
        this.servico.add(servico);
    }

    private static String formatar(String titulo, String item){
        String div = "----------------------------------------";
        int finalDiv = div.length() -1;
        int finalItem = titulo.length() + item.length() -1;

        while(finalDiv != finalItem && item.length() < div.length()){
            item = " " + item;
            finalItem = titulo.length() + item.length() -1;

        }
        return titulo + item;
    }

    private static String formatCPF(String CPF){
        String CPFformated = ""; 
        for(int i = 0; i < CPF.length(); i++){
            CPFformated += CPF.charAt(i);
            if(i == 2 || i == 5){
                CPFformated += ".";
            }
            if(i == 8){
                CPFformated += "-";
            }
        }
        return CPFformated;
    }

    public void imprimir(){
        System.out.println("");
        System.out.println("           Ordem de serviço N°          ");
        System.out.println("----------------------------------------");
        System.out.println(formatar("Cliente", this.cliente.getNome()));
        System.out.println(formatar("CPF", formatCPF(this.cliente.getCPF())));
        System.out.println(formatar("Endereço", this.cliente.getEndereco()));
        System.out.println(formatar("Contato", this.cliente.getContato()));
        System.out.println("");
        System.out.println(formatar("Veículo", this.veiculo.getDescricao()));
        System.out.println(formatar("Placa", this.veiculo.getPlaca()));
        System.out.println(formatar("Ano", this.veiculo.getAno()));
        System.out.println("");
        System.out.println("                Serviço                 ");
        System.out.println("----------------------------------------");
        for(int i = 0; i < this.servico.size(); i++){
            System.out.println(formatar(this.servico.get(i).getDescricao(), String.valueOf(this.servico.get(i).getValor())));
        }
        System.out.println("----------------------------------------");
        System.out.println(formatar("Total", String.valueOf(this.total)));
        System.out.println("----------------------------------------");   
    }
}
