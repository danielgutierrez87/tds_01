package PlataformaCompras;

public class Produto {

        
        private String nome;
        private Double preco;
    
        private String nomeProd;
        private float precoProd;
        private String descricao;
    
        public String getNome() {
            return this.nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public Double getPreco() {
            return this.preco;
        }
        public void setPreco(Double preco) {
            this.preco = preco;
        }
        public String getDescricao() {
            return this.descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }