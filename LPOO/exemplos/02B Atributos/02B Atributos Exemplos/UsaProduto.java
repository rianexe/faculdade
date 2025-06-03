class UsaProduto{

	public static void main(String[] args){		
		Produto mochila = new Produto();
		//atributos recebendo os seus valores / referências
		mochila.descricao = "Mochila grande";
		mochila.preco = 50.0;


		System.out.println("Descricao: " + mochila.descricao);
		System.out.println("Preco: " + mochila.preco);

		Produto tv = new Produto();
		//atributos recebendo os seus valores / referências
		tv.descricao = "TV 50 polegadas";
		tv.preco = 2999.0;

		//tv = mochila; // o que acontece se descomentar esta linha

		System.out.println("Descricao: " + tv.descricao);
		System.out.println("Preco: " + tv.preco);
		
	}

}