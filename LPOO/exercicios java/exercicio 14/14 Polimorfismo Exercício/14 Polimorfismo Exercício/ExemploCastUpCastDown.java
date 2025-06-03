public class ExemploCastUpCastDown{
	public static void main(String[] args){	

	System.out.println("\tCast Up");
	// crie um objeto ProdutoDigital
	ProdutoDigital livro = new ProdutoDigital("Livro Java",50.00);
	// atribua o produtoDigital criado a varaiavel produto
	Produto produto = livro;
	System.out.println("\timprime() sobreescrito em ...");
	produto.imprime();
	// atribua o produtoDigital criado a varaiavel object
	Object object = livro;
	System.out.println("\ttoString() herdado de ...");
	System.out.println(object.toString());

	String texto = "Uma String qualquer";
	//object = texto;
	//verifica se object aponta para um objeto do tipo Produto
	if(object instanceof Produto){
		System.out.println("\tCast Down");
		//casting de objetos
		produto = (Produto) object;
		produto.imprime();
	}else{
		System.out.println("Não é possível converter "+ object.getClass()+" para Produto");
	}

	}
}



