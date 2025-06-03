public class Fornecedor {
    private String razaoSocial;
    private Produto[] produtos;

    public Fornecedor(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public Produto[] getProdutos() {
        return produtos;
    }
    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
    
}
