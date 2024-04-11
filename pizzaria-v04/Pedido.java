import java.util.ArrayList;

public class Pedido {
    private Double total = 0d;
    private ArrayList<ItemDoPedido> itemDoPedido = new ArrayList<ItemDoPedido>();
    private String cliente;
    private String localEntrega;

    public void adicionarItemDoPedido(ItemDoPedido item) {
        this.itemDoPedido.add(item);
        this.addTotal(item.getValor());
    }
    public ItemDoPedido getItemDoPedido(int index) {
        return this.itemDoPedido.get(index);
    }
    public Integer contItensDoPedido() {
        return this.itemDoPedido.size();
    }
    public void addTotal(Double valor) {
        this.total += valor;
    }
    public Double getTotal() {
        return this.total + this.getTaxaEntrega();
    }
    
    public void setCliente(String nome) {
        this.cliente = nome;
    }
    public String getCliente() {
        return this.cliente;
    }

    public void setLocalEntrega(String local) {
        this.localEntrega = local;
    }
    public String getLocalEntrega() {
        return this.localEntrega;
    }

    public Double getTaxaEntrega() {
        String local = this.getLocalEntrega();

        if (local.equalsIgnoreCase("centro")) {
            return 10.0;
        }
        if(local.equalsIgnoreCase("bairro")) {
            return 15.0;
        }
        return 20.0;
    }

    public void imprimir() {
        System.out.printf("Cliente  %35s\n", this.cliente);
        for (int i =0; i < this.itemDoPedido.size(); i++) {
            System.out.printf("%34s : %7.2f\n",
                this.itemDoPedido.get(i).getTipo()
                + " " +
                this.itemDoPedido.get(i).getSabor(), 
                this.itemDoPedido.get(i).getValor()
            );
        }
        System.out.printf("%-34s : %7.2f\n",
            "> Entrega " + this.getLocalEntrega(), 
            this.getTaxaEntrega()
        );
        System.out.printf("%-34s : %7.2f\n", "> Total", this.getTotal());
    }
}