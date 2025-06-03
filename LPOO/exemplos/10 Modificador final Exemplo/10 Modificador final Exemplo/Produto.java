//classes final nao podem ser herdadas (extends Produto)
public /* final */ class Produto {
	private String descricao; //null

	/* atributos final so podem ser inicializados na criacao do objeto, 
	 * ou seja, no construtor ou no bloco de inicializacao de objetos
	 * sem que seja atribuido duas vezes valores
	 */
	private /* final */ double preco;

	private Fornecedor fornecedor;

	//CONSTANTE da classe 
	public static final double PRECO_MINIMO = 0.01;


	public Produto(String descricao, double preco){
		this(descricao); 
		this.setPreco(preco);
	}

	public Produto(String descricao){
		this.setDescricao(descricao);
	}

	// o parametro descricao nao pode ser alterado
	public void setDescricao(/* final */ String descricao){
		//descricao = "Outra descricao";
		this.descricao = descricao;
	}

	public String getDescricao(){
		return this.descricao;
	}

	public void setPreco(double preco){
		if(preco < Produto.PRECO_MINIMO){
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

	// metodos final nao podem ser sobreescritos (override) nas subclasses (neste caso ProdutoDigital)
	public /* final */ String toString(){
		return "Produto{descricao:"+ this.descricao + ", preco:" + this.preco + "}";
	}


	public void imprime(){
		System.out.println("Descricao: " + descricao + " custa " + preco + " reais");
		if(this.fornecedor!=null){
			this.fornecedor.imprime();
		}
	}


}














