
import java.util.List; 

public class Pedido {

    public double total;
    public int id; 
    public double txEntrega; 
    public List<ItensDoPedido> ItensDoPedido = new ArrayList();
    public String cliente; 

    public void adicionarItemDoPedido(ItensDoPedido item) {
        this.ItensDoPedido.add(item); 
    }

    public void setCliente(String nome) {
        this.cliente = nome;  
    }

    public void setTxEntrega(double txEntrega) {
        this.txEntrega = txEntrega; 
    }

    public void imprimir() {
        System.out.println("Cliente: " + this.cliente);
        System.out.println("");
        System.out.println();
    }
    

}