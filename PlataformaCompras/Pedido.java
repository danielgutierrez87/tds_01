package PlataformaCompras;

public class Pedido {
    
    private String produto[] = new String[3];
    private String data; 
    private String endereco;
    private float pagamento;
    private float frete;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public float isPagamento() {
        return pagamento;
    }
    public void setPagamento(float pagamento) {
        this.pagamento = pagamento;
    }
    public float getFrete() {
        return frete;
    }
    public void setFrete(float frete) {
        this.frete = frete;
    }
}
