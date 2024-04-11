import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        OrdemServico ordemServico = new OrdemServico();
        
        Cliente cliente = new Cliente();
        System.out.println("Cliente");
        System.out.print("Nome: ");
        cliente.setNome(input.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereco(input.nextLine());
        System.out.print("CPF: ");
        cliente.setCPF(input.nextLine());
        System.out.print("Contato: ");
        cliente.setContato(input.nextLine());
        ordemServico.setCliente(cliente);
        System.out.println("");

        Veiculo veiculo = new Veiculo();
        System.out.println("Veículo");
        System.out.print("Descrição: ");
        veiculo.setDescricao(input.nextLine());
        System.out.print("Placa: ");
        veiculo.setPlaca(input.nextLine());
        System.out.print("Ano: ");
        veiculo.setAno(input.nextLine());
        ordemServico.setVeiculo(veiculo);
        System.out.println("");

        String continuar;
        do{
            Servicos servico = new Servicos();
            System.out.println("Serviço");
            System.out.print("Descrição: ");
            servico.setDescricao(input.nextLine());
            System.out.print("Valor: ");
            servico.setValor(input.nextDouble());
            input.nextLine();
            ordemServico.addTotal(servico.getValor());
            ordemServico.addServico(servico);
            System.out.println("");

            System.out.print("Novo serviço? ");
            continuar = input.nextLine();

        } while(!continuar.equalsIgnoreCase(""));

        ordemServico.imprimir();

        input.close();

    }
}