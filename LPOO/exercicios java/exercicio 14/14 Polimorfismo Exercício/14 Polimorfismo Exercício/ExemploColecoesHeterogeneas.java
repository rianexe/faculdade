public class ExemploColecoesHeterogeneas{
	public static void imprimeOpcoesDeParcelamento
				(Produto produto, Parceladora[] parceladoras){
		for(Parceladora parceladora: parceladoras){
		    System.out.
			println("============================================");
		    PlanoDePagamento plano = parceladora.parcela(produto); 
		    plano.imprime();
		}
		System.out.println("============================================");
		
	}
	public static void main(String[] args){	

		Produto tv = new Produto("Tv", 3500.0);
		tv.imprime();
		//crie uma parceladora de cada tipo 
		Parceladora parc1 = new ParceladoraCartao();
		Parceladora parc2 = new ParceladoraCheque();
		Parceladora parc3 = new ParceladoraBoleto();
		//colecao heterogenea 
		Parceladora[] parcs = {parc1, parc2, parc3};
		imprimeOpcoesDeParcelamento(tv, parcs);
	}

}



