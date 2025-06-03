class UsaPessoa{

	public static void main(String[] args){
		Pessoa marcelo = new Pessoa();
		marcelo.nome = "Marcelo";
		marcelo.idade = 44;
		System.out.println("Pessoa: " + marcelo.nome + " tem " + marcelo.idade + " anos");
		Pessoa daniel = new Pessoa();
		daniel.nome = "Daniel";
		daniel.idade = 20;
		System.out.println("Pessoa: " + daniel.nome + " tem " + daniel.idade + " anos");
	}

}