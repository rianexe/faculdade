public class Pessoa{
	private String nome;
	private int idade = 18;
	private Endereco endereco;

	//atributo estatico
	private static int idadeMinima = 18;
	
	//bloco estatico que imprima o atributo idadeMinima
	static{
		System.out.println("Idade minima: " + Pessoa.idadeMinima);
	}
	
	//metodos estaticos de acesso 
	
	public static void setIdadeMinima(int idadeMinima){
		Pessoa.idadeMinima = idadeMinima;
	}
	
	public static int getIdadeMinima(){
		return Pessoa.idadeMinima;
	}

	//construtores
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
		if(idade<idadeMinima){
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
	
	public void imprime(){
		System.out.println("Pessoa: " + this.nome + " tem " + this.idade + " anos");
		if(this.endereco != null){
			this.endereco.imprime();
		}
	}

}