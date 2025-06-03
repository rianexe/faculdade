public class Produto {
	//atributos não estaticos (do objeto)
	private String descricao; //null
	private double preco; // 0.0
	private Fornecedor fornecedor;

	//atributo estatico (da classe)
	private static double precoMinimo = 1.99;

	//bloco de inicialização estatico (da classe)
	//o contexto estatico e anterior a criacao de objetos
	static{
		System.out.println("====================");
		System.out.println("Bloco de inicializacao classe");
		System.out.println("\tPreco minimo: " + Produto.precoMinimo);
		System.out.println("====================");
	}


	// metodos estaticos so podem ser sobreescritos (override) por metodos estaticos
	public static double getPrecoMinimo(){
		return Produto.precoMinimo;
	}

	public static void setPrecoMinimo(double precoMinimo){
		Produto.precoMinimo = precoMinimo;
	}

	//bloco de inicialização de instancias (de objetos)
	{
		System.out.println("Produto: Bloco de inicializacao objeto");
	}	


	public Produto(String descricao, double preco){
		this(descricao); 
		this.setPreco(preco);
	}

	public Produto(String descricao){
		this.setDescricao(descricao);
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao(){
		return this.descricao;
	}

	public void setPreco(double preco){
		if(preco < Produto.precoMinimo){
			System.out.println("Preço inválido: " + preco);
		}else{
			this.preco = preco;
		}
	}

	public double getPreco(){
		return this.preco;
	}

	public void setFornecedor(Fornecedor fornecedor){
		this.fornecedor = fornecedor;
	}

	public Fornecedor getFornecedor(){
		return this.fornecedor;
	}


	public String toString(){
		return "Produto{descricao:"+ this.descricao + ", preco:" + this.preco + "}";
	}

	public void imprime(){
		System.out.println("Descricao: " + descricao + " custa " + preco + " reais");
		if(this.fornecedor!=null){
			this.fornecedor.imprime();
		}
	}

}














