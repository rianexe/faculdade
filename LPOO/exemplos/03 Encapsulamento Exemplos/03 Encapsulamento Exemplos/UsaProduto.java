class UsaProduto{

	public static void main(String[] args){
		Produto mochila = new Produto();
		mochila.inicializaProduto("Mochila grande",50.0);
		mochila.imprime();

		Produto tv = new Produto();
		tv.inicializaProduto("TV 50 polegadas",-2999.0);
		System.out.println("Consultar preco da TV: " + tv.getPreco());
		//tv.preco = -2999.0;
		tv.setPreco(-2999.0);
		tv.imprime();
	}
}