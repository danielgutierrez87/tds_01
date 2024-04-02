package PlataformaCompras;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {
    private Double frete;
    private String endereco;
    private String pagamento;
    private ArrayList<Produto> produto = new ArrayList<Produto>();
    private Cliente cliente;

    public Double getFrete() {
        return this.frete;
    }
    public void setFrete(Double frete) {
        this.frete = frete;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getData() {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return data.format(formato);
    }
    public String getPagamento() {
        return this.pagamento;
    }
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    public Produto getProduto(int index) {
        return this.produto.get(index);
    }
    public void addProduto(Produto produto) {
        this.produto.add(produto);
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getTotal() {
        Double total = this.getFrete();
        for(int i = 0; i < this.produto.size(); i++) {
            total += this.getProduto(i).getPreco();
        }
        return total;
    }
    
    public void imprimir() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("          Venda da esquina          ");
        System.out.println("------------------------------------");
        for(int i = 0; i < this.produto.size(); i++) {
            System.out.println("Produto: " + this.getProduto(i).getNome());
            System.out.println("         " + this.getProduto(i).getPreco());
        }
        System.out.println("------------------------------------");
        System.out.println("Entregar: " + this.getEndereco());
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Telefone: " + this.getCliente().getTelefone());
        System.out.println("------------------------------------");
        System.out.println("Frete: " + this.getFrete());
        System.out.println("------------------------------------");
        System.out.println("TOTAL: " + this.getTotal());
        System.out.println("------------------------------------");
        System.out.println("Forma de pagamento: " + this.getPagamento());
        System.out.println("------------------------------------");
        System.out.println(this.getData());
    }
}