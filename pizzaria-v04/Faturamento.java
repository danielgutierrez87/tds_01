import java.util.ArrayList;

public class Faturamento {
    Double totalGeral = .0;
    Double totalMotoboy = .0;
    Integer qtdItensDoPedido = 0;
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        this.addTotalGeral(pedido.getTotal());
        this.addTotalMotoboy(pedido.getTaxaEntrega());
        this.addQtdItensDoPedido(pedido.contItensDoPedido());
    }

    public void addQtdItensDoPedido(Integer qtd) {
        this.qtdItensDoPedido += qtd;
    }
    public Integer getQtdItensDoPedido() {
        return this.qtdItensDoPedido;
    }
    public void addTotalGeral(Double valor) {
        this.totalGeral += valor;
    }
    public Double getTotalGeral() {
        return this.totalGeral;
    }
    public void addTotalMotoboy(Double valor) {
        this.totalMotoboy += valor;
    }
    public Double getTotalMotoboy() {
        return this.totalMotoboy;
    }

    public Double getTotalLiquido() {
        return this.getTotalGeral() - this.getTotalMotoboy();
    }

    public void imprimirRelatorio() {
        System.out.println("--------------------------------------------");
        System.out.println("                  PIZZARIA                  ");
        System.out.println("                 QuasePronto                ");
        System.out.println("--------------------------------------------");
        for(int i = 0; i < this.pedidos.size(); i++) {
            if (i > 0) {
                System.out.printf("- %42s\n","-");
            }
            this.pedidos.get(i).imprimir();
        }
        System.out.println("--------------------------------------------");
        System.out.println("                   RESUMO                   ");
        System.out.printf("%-33s :  %7d\n", "Pedidos realizados", this.pedidos.size());
        System.out.printf("%-33s :  %7d\n", "Qtd. Pizzas", this.getQtdItensDoPedido());
        System.out.printf("%-33s :  %7.2f\n", "Total da noite", this.getTotalGeral());
        System.out.printf("%-33s :  %7.2f\n", "Pagar ao motoboy", this.getTotalMotoboy());
        System.out.printf("%-33s :  %7.2f\n", "Total líquido", this.getTotalLiquido());
        System.out.println("--------------------------------------------");

    }
}