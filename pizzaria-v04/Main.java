import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("* Bem vindo a pizzaria! *");
        System.out.println("*************************");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        Faturamento faturamento = new Faturamento();

        while(true) {
            System.out.println("Escolha uma opção");
            System.out.println("1: Novo pedido");
            System.out.println("2: Imprimir histórico");
            System.out.println("#: Sair");
            String opcao = scan.nextLine();

            if ( opcao.equals("#") ) {
                break;
            }

            Pedido  pedido = new Pedido();
            String continuar;
            do {
                ItemDoPedido item = new ItemDoPedido();

                System.out.print("Informe o tipo de pizza: ");
                item.setTipo(scan.nextLine().trim());

                System.out.print("Informe o sabor da pizza: ");
                item.setSabor(scan.nextLine().trim());

                pedido.adicionarItemDoPedido(item);

                System.out.print("mais alguma coisa? ");
                continuar = scan.nextLine().trim();
            } while (!continuar.equalsIgnoreCase(""));

            System.out.print("Nome do cliente: ");
            pedido.setCliente(scan.nextLine().trim());

            System.out.print("Local de entrega: ");
            pedido.setLocalEntrega(scan.nextLine().trim());

            faturamento.addPedido(pedido);
        }

        faturamento.imprimirRelatorio();

        scan.close();
    }
}