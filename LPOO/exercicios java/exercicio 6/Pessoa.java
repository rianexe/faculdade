class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
        if (endereco != null) {
            endereco.imprime();
        }
    }
}