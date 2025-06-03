class produto{
	String descricao;
	double preco;
	String marca;
	double peso;

	void inicializaProduto(String novaDescricao, String novaMarca, double novoPreco, double novoPeso){
		descricao = novaDescricao;
		preco = novoPreco;
		marca = novaMarca;
		peso = novoPeso;
	}

	void imprime(){
		System.out.println("Descricao: " + descricao +  " a marca e " + marca + " custa " + preco + " reais" +  " e pesa: " + peso);
	}

}