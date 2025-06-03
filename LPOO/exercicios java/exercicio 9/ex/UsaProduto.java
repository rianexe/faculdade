class UsaProduto{

	public static void main(String[] args){
		System.out.println(
			"Preço mínimo a partir da classe " 
				+ Produto.getPrecoMinimo());

		Produto mochila = new Produto("Mochila Grande", 50.0);

		System.out.println("Alterando o preço mínimo a partir do objeto");

		// o ideal eh acessar os metodos estaticos a partir da classe
		//Produto.setPrecoMinimo(10.0);
		mochila.setPrecoMinimo(10.0);

		double tamanho = 90.0;//kB
		ProdutoDigital ebook = new ProdutoDigital("Java8 ",90.0, tamanho);
		System.out.println("Preço mínimo a partir da referencia ebook " 
					+ ebook.getPrecoMinimo());
	}
}