import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Cliente cliente = new Cliente();
        Veiculo veiculo = new Veiculo();
        OrdemServico ordemServico = new OrdemServico();

        System.out.print("Veículo Descricao: ");
        veiculo.setDescricao(scan.nextLine());
        System.out.print("Veículo Placa: ");
        veiculo.setPlaca(scan.nextLine());
        System.out.print("Veículo Ano: ");
        veiculo.setAno(scan.nextInt());
        scan.nextLine();
        ordemServico.setVeiculo(veiculo);
        System.out.println("-------------");

        System.out.print("Cliente Nome: ");
        cliente.setNome(scan.nextLine());
        System.out.print("Cliente Cpf: ");
        cliente.setCpf(scan.nextLine());
        System.out.print("Cliente Contato: ");
        cliente.setContato(scan.nextLine());
        System.out.print("Cliente Endereco: ");
        cliente.setEndereco(scan.nextLine());
        ordemServico.setCliente(cliente);
        System.out.println("-------------");

        while (true) {
            Servico servico = new Servico();
            System.out.print("Serviço Descricao: ");
            servico.setDescricao(scan.nextLine());
            System.out.print("Serviço Valor: ");
            servico.setValor(scan.nextDouble());
            scan.nextLine();
            ordemServico.addServico(servico);

            System.out.print("Mais serviços?");
            if (scan.nextLine().equals("")) {
                break;
            }
        }

        ordemServico.imprimir();
    }
}
