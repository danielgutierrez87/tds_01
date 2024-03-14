
import java.util.List; 

public class Pedido {

    private ItensDoPedido itemDoPedido;
    private double txEntrega; 
    private String cliente; 

    public void adicionarItemDoPedido(ItensDoPedido item) {
        this.itemDoPedido = item; 
    }

    public void setCliente(String nome) {
        this.cliente = nome;  
    }

    public void setTxEntrega(double txEntrega) {
        this.txEntrega = txEntrega; 
    }

    public double getTotal() {
        return this.txEntrega + this.itemDoPedido.getValor();
    }

    public void imprimir() {
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Tipo: " + this.itemDoPedido.getTipo());
        System.out.println("Valor: " + this.itemDoPedido.getValor());
        System.out.println("Sabor: " + this.itemDoPedido.getSabor());
        System.out.println("Tx Entrega: " + this.txEntrega);
        System.out.println("Total: " + this.getTotal()); 
    }
}