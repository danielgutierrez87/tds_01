import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        OrdemServico ordem = new OrdemServico();
        Servico servico = new Servico();
        Veiculo veiculo = new Veiculo();

        Scanner input = new Scanner(System.in);

        System.out.println("Cliente");
        System.out.print("Nome: ");
        cliente.setNome(input.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereco(input.nextLine());
        System.out.print("CPF: ");
        cliente.setCpf(input.nextLine());
        System.out.print("Contato: ");
        cliente.setContato(input.nextLine());
        ordem.setCliente(cliente);

        System.out.println("Veículo");
        System.out.print("Descrição: ");
        veiculo.setDescricao(input.nextLine());
        System.out.print("Placa: ");
        veiculo.setPlaca(input.nextLine());
        System.out.print("Ano: ");
        veiculo.setAno(input.nextInt());
        ordem.setVeiculo(veiculo);
        
        System.out.println("Serviço");
        System.out.print("Valor: ");
        servico.setValor(input.nextDouble());
        input.nextLine();
        System.out.print("Descrição: ");
        servico.setDescriçao(input.nextLine());
        
    }
}
