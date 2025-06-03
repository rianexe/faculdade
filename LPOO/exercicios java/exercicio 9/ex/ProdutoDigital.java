public class ProdutoDigital extends Produto{
	private double tamanho; //em bytes

	public ProdutoDigital(String descricao, double preco, double tamanho){
		this(descricao, tamanho);//PCC chamada ao construtor da superclasse
		this.tamanho = tamanho;
	}

	public ProdutoDigital(String descricao, double tamanho){
		super(descricao);//PCC chamada ao construtor da superclasse
		this.tamanho = tamanho;
	}

	public void setTamanho(double tamanho){
		this.tamanho = tamanho;
	}

	public double getTamanho(){
		return this.tamanho;
	}



	public String toString(){
		return "ProdutoDigital{descricao:"+ this.getDescricao() + ", preco:" + this.getPreco() 
						+ ", tamanho:" + this.tamanho + "}";
	}

	public void imprime(){
		super.imprime();
		System.out.println("Tamanho: " + this.tamanho);
	}



}