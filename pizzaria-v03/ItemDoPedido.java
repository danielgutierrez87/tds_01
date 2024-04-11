public class ItemDoPedido{
    private String sabor;
    private String tipo;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
    
    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public String getSabor(){
        return this.sabor;
    }

    public double getValor(){
        if(this.tipo.equalsIgnoreCase("especial")){
            return 50;
        } else {
            return 40;
        }
    }

}