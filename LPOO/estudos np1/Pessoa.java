class Pessoa {	//atributos encapsulados 
    private String nome;
    private int idade;
	//associação da classe Endereco com a classe Pessoa
    private Endereco enderecoResidencial;	
    private Endereco enderecoTrabalho;
    private Endereco enderecoOpcional;
	
	//fazendo construtor da classe Pessoa
    Pessoa(String nome, int idade, Endereco enderecoResidencial) {		
        this.nome = nome;
        this.idade = idade;
        this.enderecoResidencial = enderecoResidencial;
        this.enderecoTrabalho = null;
    }

	//construtor
    Pessoa(String nome, int idade, Endereco enderecoResidencial, Endereco enderecoTrabalho) {	
        this(nome, idade, enderecoResidencial);
        this.enderecoTrabalho = enderecoTrabalho;
    }

	//construtor, são feitos vários para que quando você declare um objeto pessoa, e na atribuição dos parâmetros, por estarem com o mesmo nome, a quantidade de paramentros define qual construtor será chamado
    Pessoa(String nome, int idade, Endereco enderecoResidencial, Endereco enderecoTrabalho, Endereco enderecoOpcional) {	
        this(nome, idade, enderecoResidencial, enderecoTrabalho);
        this.enderecoOpcional = enderecoOpcional;
    }

	//métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public Endereco getEnderecoTrabalho() {
        return enderecoTrabalho;
    }

    public void setEnderecoTrabalho(Endereco enderecoTrabalho) {
        this.enderecoTrabalho = enderecoTrabalho;
    }

    public Endereco getEnderecoOpcional() {
        return enderecoOpcional;
    }

    public void setEnderecoOpcional(Endereco enderecoOpcional) {
        this.enderecoOpcional = enderecoOpcional;
    }
	
	//método para a impressão dos dados da Pessoa, com verificação se há ou não endereço de trabalho e opcional
   public void exibirDados() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
        System.out.println("Endereco Residencial:");
        enderecoResidencial.exibirEndereco();

        if (enderecoTrabalho != null) {
            System.out.println("Endereco do Trabalho:");
            enderecoTrabalho.exibirEndereco();
        }

        if (enderecoOpcional != null) {
            System.out.println("Endereco Opcional:");
            enderecoOpcional.exibirEndereco();
        }
    }
}	