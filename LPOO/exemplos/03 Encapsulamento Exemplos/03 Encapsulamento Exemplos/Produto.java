public class Produto{
	//para encapsular fortemente os atributos tem que ser privados (private)
	private String descricao; //null
	private double preco; // 0.0
	private double precoMinimo = 0.0;

	public void inicializaProduto(String descricao, double preco){
		this.descricao = descricao;
		this.setPreco(preco);
	}


	//entao criamos metodos de acesso setters para alterar 
	//e getters para consultar os valores dos atributos

	// public void set<NomeDoAtributo>(<tipoAtributo> nomeParametro)
	// this é uma palavra reservada que representa uma referencia para o proprio objeto
	public void setDescricao(String descricao){
		//atributo recebe parametro  
		this.descricao = descricao;
	}

	// public <tipoAtributo> get<NomeDoAtributo>()
	public String getDescricao(){
		return this.descricao;
	}

	public void setPreco(double preco){
		if(preco<precoMinimo){
			System.out.println("Preço inválido: " + preco);
		}else{
			this.preco = preco;
		}
	}

	public double getPreco(){
		return this.preco;
	}


	public void imprime(){
		System.out.println("Descricao: " + descricao + " custa " + preco + " reais");
	}

}