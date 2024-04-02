package PlataformaCompras;

import java.util.Scanner;

public class Plataforma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Pedido pedido = new Pedido();

<<<<<<< HEAD
        String continuar = "";
        
=======
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

>>>>>>> 9fd79aac3b5e5e55f6ecef8f9130b662bd9f6dcf
        do {
            Produto produto = new Produto();
            System.out.print("Produto: ");
            produto.setNome(scan.nextLine());

            System.out.print("Preço: ");
<<<<<<< HEAD
            produto.setPreco(scan.nextDouble());
            scan.nextLine();
=======
            produto.setPrecoProd(input.nextFloat());
            input.nextLine();
>>>>>>> 9fd79aac3b5e5e55f6ecef8f9130b662bd9f6dcf

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