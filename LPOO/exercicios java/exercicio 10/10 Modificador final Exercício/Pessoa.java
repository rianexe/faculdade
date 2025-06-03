public class Pessoa {
	private String nome;
	private int idade = 18;
	private Endereco endereco;

	public static final int IDADE_MINIMA = 18;

	// bloco de inicialização estático (da classe)
	static {
		System.out.println("====================");
		System.out.println("Bloco de inicializacao classe");
		System.out.println("\tIdade minima: " + Pessoa.IDADE_MINIMA);
		System.out.println("====================");
	}

	public Pessoa(String nome, int idade) {
		this(nome);
		this.setIdade(idade);
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		if (idade < IDADE_MINIMA) {
			System.out.println("Idade invalida " + idade);
		} else {
			this.idade = idade;
		}
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void imprime() {
		System.out.println("Pessoa: " + this.nome + " tem " + this.idade + " anos");
		if (this.endereco != null) {
			this.endereco.imprime();
		}
	}
}
