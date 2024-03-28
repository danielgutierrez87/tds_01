
public class ItensDoPedido {
    
    private double valor; 
    private String sabor;
    private String tipo; 

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        if (this.getTipo().equalsIgnoreCase("tradicional")) {
            return 40.0;
        } else {
            return 50.0;
        }
    }
}