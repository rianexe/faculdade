class Endereco {	//classe Endereco com seus proprios atributos
    private String rua;
    private int numero;
    private String cidade;

    Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    void exibirEndereco() {
        System.out.println("Rua: " + rua + "\nNumero: " + numero + "\nCidade: " + cidade);
    }
}