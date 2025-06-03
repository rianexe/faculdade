class Produto{
	String descricao;
	double preco;
	// tipoRetorno nomeMetodo (lista de parametros)
	// 	(tipoParametro nomeParametro, tipoParametro nomeParametro)

	void inicializaProduto(String novaDescricao, double novoPreco){
		descricao = novaDescricao;
		preco = novoPreco;
	}

	void imprime(){
		System.out.println("Descricao: " + descricao + " custa " + preco + " reais");
	}

}
