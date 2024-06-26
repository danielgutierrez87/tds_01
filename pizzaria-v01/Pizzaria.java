import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("Bem vindo a pizzaria:");

        Scanner scan = new Scanner(System.in);

        Pedido pedido = new Pedido();
        ItensDoPedido item = new ItensDoPedido();

        System.out.println("Informe a categoria da pizza: ");
        item.setTipo(scan.nextLine());

        System.out.println("Informe o sabor da pizza: ");
        item.setSabor(scan.nextLine());

        System.out.println("Informe o valor da pizza: ");
        item.setValor(scan.nextDouble());

        System.out.println("Nome do cliente: ");
        pedido.setCliente(scan.next());

        System.out.println("Taxa de entrega: ");
        pedido.setTxEntrega(scan.nextDouble());

        pedido.adicionarItemDoPedido(item);
        pedido.imprimir();
    }
}