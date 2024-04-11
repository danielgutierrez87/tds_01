public class ItemDoPedido {
    private String tipo;
    private String sabor;

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

    public Double getValor() {
        if ( this.getTipo().equalsIgnoreCase("tradicional") ) {
            return 40.0;
        } else {
            return 50.0;
        }
    }
}
