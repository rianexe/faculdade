public class Produto{
	public String nome;
	public static int qtdProdutos;
	
	Produto(String nome){
		this.nome = nome;
		qtdProdutos++;
	}
	
	public static void exibirProduto(){
		System.out.println("Quantidade de produtos: " + qtdProdutos);
	}
}