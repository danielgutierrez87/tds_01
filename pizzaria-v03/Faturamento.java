import java.util.ArrayList;

public class Faturamento{
    private double totalGeral = 0;
    private double totalMotoboy = 0;
    private double totalLiquido = 0;
    private ArrayList<Pedido> pedido = new ArrayList<>();

    public void setTotalGeral(double totalGeral){
        this.totalGeral += totalGeral;
    }

    public double getTotalGeral(){
        return this.totalGeral;
    }

    public void setTotalMotoboy(double totalMotoboy){
        this.totalMotoboy += totalMotoboy;
    }

    public double getTotalMotoboy(){
        return this.totalMotoboy;
    }

    public void setTotalLiquido(double totalLiquido){
        this.totalLiquido += totalLiquido;
    }

    public void addPedido(ArrayList<Pedido> pedido){
        this.pedido = pedido;
    }

    public void imprimirHistorico(){
        System.out.println("----------------------------------------");
        for(int i = 0; i < pedido.size(); i++){
            System.out.println(pedido.get(i).imprimir());
        }
        System.out.println("----------------------------------------");
        System.out.println(pedido.formatar("Total Geral", this.totalGeral));
        System.out.println(pedido.formatar("Total Motoboy", this.totalMotoboy));
        System.out.println(pedido.formatar("Total Liquido", this.totalLiquido));
        System.out.println("----------------------------------------");
    }

}