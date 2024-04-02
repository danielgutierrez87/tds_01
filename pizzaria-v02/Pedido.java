import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemDoPedido> itemDoPedido = new ArrayList<ItemDoPedido>();
    private String cliente;
    private String localEntrega;

    public void adicionarItemDoPedido(ItemDoPedido item) {
        this.itemDoPedido.add(item);
    }
    public ItemDoPedido getItemDoPedido(int index) {
        return this.itemDoPedido.get(index);
    }

    public Double getTotal() {
        Double total = this.getTaxaEntrega();
        for(int i = 0; i < this.itemDoPedido.size(); i++) {
            total += this.itemDoPedido.get(i).getValor();
        }
        return total;
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
        } else
        if(local.equalsIgnoreCase("bairro")) {
            return 15.0;
        } else {
            return 20.0;
        }
    }

    public void imprimir() {
        System.out.println("--------------------------------------------");
        System.out.println("                  PIZZARIA                  ");
        System.out.println("                 QuasePronto                ");
        System.out.println("--------------------------------------------");
        System.out.println(" Cliente     : " + this.cliente);
        System.out.println("--------------------------------------------");
        for (int i =0; i < this.itemDoPedido.size(); i++) {
            if (i > 0 ) {
                System.out.println();
            }
            System.out.println(" Tipo        : " + this.itemDoPedido.get(i).getTipo());
            System.out.println(" Sabor       : " + this.itemDoPedido.get(i).getSabor());
            System.out.println(" Valor       : " + this.itemDoPedido.get(i).getValor());
        }
        System.out.println("--------------------------------------------");
        System.out.println(" Entregar em : " + this.getLocalEntrega());
        System.out.println(" Taxa        : " + this.getTaxaEntrega());
        System.out.println("--------------------------------------------");
        System.out.println(" Total       : " + this.getTotal());
        System.out.println("--------------------------------------------");
    }
}