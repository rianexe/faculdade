class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome) {
        this.nome = nome;
    }

    Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }

    void exibePessoa() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}