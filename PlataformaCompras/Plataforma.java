package PlataformaCompras;

import java.util.Scanner;

/* Projetar um sistema orientado a objetos para uma 
plataforma de compras on-line. Suas classes devem incluir
- Usuário: nome, e-mail e senha;
- ⁠Produto: nome, preço e descrição; 
- ⁠Pedido: produtos, data, endereço, informações de pagamento e frete;
Use o encapsulamento para proteger dados confidenciais e a 
composição para criar relações entre objetos conforme necessário. */

public class Plataforma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Produto nomeProd = new Produto(); 

        String continuar = "";

        do {
            System.out.print("Produto: ");
            nomeProd.setNomeProd(scan.nextLine());

            System.out.print("Preço: ");
            nomeProd.setPrecoProd(scan.nextDouble());

            System.out.print("Descrição: ");
            nomeProd.setDescricao(scan.nextLine());

            Pedido pedido = new Pedido();
            pedido.setNomeProd(nomeProd); 

            System.out.print("Endereço: ");
            pedido.setEndereco(scan.nextLine());

            System.out.print("Frete: ");
            pedido.setFrete(scan.nextDouble());

            Cliente cliente = new Cliente();
            System.out.print("Cliente: ");
            cliente.setNome(scan.nextLine());

            System.out.print("Telefone: ");
            cliente.setTelefone(scan.nextLine());

            pedido.imprimir();
            scan.close();
        }
    }
}
