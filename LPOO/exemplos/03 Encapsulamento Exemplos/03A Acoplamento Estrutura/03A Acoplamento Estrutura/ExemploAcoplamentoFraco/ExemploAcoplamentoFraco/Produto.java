public class Produto {
    private String descricao;
    private double preco;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public Produto(String descricao, double preco) {
        this(descricao);
        this.setPreco(preco);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (this.preco <0){
            System.out.println("Preço inválido");
        }else{
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", preco=" + preco + '}';
    }
    
    
}
