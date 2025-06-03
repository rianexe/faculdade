public class Pessoa{
	private String nome;
	private int idade = 18;
	private Endereco endereco;
	private TipoPessoa tipo = TipoPessoa.PF;

	// constante da classe Pessoa
	public static int IDADE_MINIMA = 18;

	public Pessoa(String nome, int idade){
		this(nome);
		this.setIdade(idade);
	}

	public Pessoa(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;	
	}
	
	public void setNome(String nome){
		this.nome = nome;	
	}

	public int getIdade(){
		return this.idade;
	}

	public void setIdade(int idade){
		if(idade < Pessoa.IDADE_MINIMA){
			System.out.println("Idade invalida " + idade);
		}else{
			this.idade = idade;	
		}
	}

	public Endereco getEndereco(){
		return this.endereco;
	}

	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}
	
	public TipoPessoa getTipo(){
		return this.tipo;
	}
	
	public void setTipo(TipoPessoa tipo){
		this.tipo = tipo;
	}
	
	public void imprime(){
		System.out.println("Pessoa: " + this.nome + " tem " + this.idade + " anos");
		System.out.println("Tipo: " + this.tipo.getDescricao());
		
		if(this.endereco != null){
			this.endereco.imprime();
		}
	}

}