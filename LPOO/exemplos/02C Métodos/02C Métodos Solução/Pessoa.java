class Pessoa{
	String nome;
	int idade;
	
	void inicializaPessoa(String novoNome, int novaIdade){
		nome = novoNome;
		idade = novaIdade;
	}

	void imprime(){
		System.out.println("Pessoa: " + nome + " tem " + idade + " anos");
	}

}