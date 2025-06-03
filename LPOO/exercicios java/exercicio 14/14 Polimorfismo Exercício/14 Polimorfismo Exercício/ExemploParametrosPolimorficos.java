public class ExemploParametrosPolimorficos{

	public static void 
		imprime(Produto produto, ImpressoraProduto impressora){
		impressora.setProduto(produto);
		impressora.imprimeProduto();
	}
	public static void main(String[] args){	
		Produto produto = new Produto("Tv", 2500.0);
		// criar um impressora de cada tipo
		ImpressoraProduto imp1 = new ImpressoraProdutoXml();
		ImpressoraProduto imp2 = new ImpressoraProdutoPipe();

		imprime(produto, imp1);
		imprime(produto, imp2);
	}
}



