package PlataformaCompras;
import java.util.Scanner;

public class Plataforma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pedido pedido = new Pedido();

        String continuar = "";
        do {
            Produto produto = new Produto();
            System.out.print("Produto: ");
            produto.setNome(scan.nextLine());

            System.out.print("Preço: ");
            produto.setPreco(scan.nextDouble());
            scan.nextLine();

            System.out.print("Descrição: ");
            produto.setDescricao(scan.nextLine());

            pedido.addProduto(produto);
            
            System.out.print("Continuar?");
            continuar = scan.nextLine();
        } while(! continuar.equals(""));

        System.out.print("Endereço: ");
        pedido.setEndereco(scan.nextLine());

        System.out.print("Frete: ");
        pedido.setFrete(scan.nextDouble());
        scan.nextLine();

        System.out.print("Pagamento: ");
        pedido.setPagamento(scan.nextLine());

        Cliente cliente = new Cliente();
        System.out.print("Cliente: ");
        cliente.setNome(scan.nextLine());
        
        System.out.print("Telefone: ");
        cliente.setTelefone(scan.nextLine());

        pedido.setCliente(cliente);

        pedido.imprimir();
        scan.close();
    }
}
