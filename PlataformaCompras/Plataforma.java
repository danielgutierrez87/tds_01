package PlataformaCompras;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Plataforma {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Pedido pedido = new Pedido();

        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        pedido.setData(data.format(formatData));

        System.out.println("Login");

        System.out.print("Nome: ");
        usuario.setNome(input.nextLine());

        System.out.print("Email: ");
        usuario.setEmail(input.nextLine());

        System.out.print("Senha: ");
        usuario.setSenha(input.nextInt());
        System.out.println();

        pedido.setCliente(usuario);

        String continuar;

        do {
            Produto produto = new Produto();
            System.out.print("Produto: ");
            produto.setNomeProd(input.nextLine());

            System.out.print("Preço: ");
            produto.setPrecoProd(input.nextFloat());
            input.nextLine();

            System.out.print("Descricao: ");
            produto.setDescricao(input.nextLine());

            pedido.setTotal(produto.getPrecoProd());

            pedido.addProduto(produto);

            System.out.print("> continuar a comprar? ");
            continuar = input.nextLine();
            System.out.println();

        } while(!continuar.equalsIgnoreCase(""));

        System.out.print("Endereço: ");
        pedido.setEndereco(input.nextLine());

        System.out.print("Frete: ");
        pedido.setFrete(input.nextDouble());
        input.nextLine();

        pedido.setTotal(pedido.getFrete());
        
        System.out.print("Pagamento: ");
        pedido.setPagamento(input.nextLine());

        pedido.imprimir();
        input.close();
    }
}
