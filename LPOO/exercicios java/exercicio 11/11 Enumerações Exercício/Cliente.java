public class Cliente extends Pessoa{
	private String cpf;
	
	public Cliente(String nome, int idade, String cpf){
		this(nome, cpf);
		this.setIdade(idade);
	}

	public Cliente(String nome, String cpf){
		super(nome);
		this.cpf = cpf;	
	}

	public String getCpf(){
		return this.cpf;	
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;	
	}

	//observe a definição do método imprime na superclasse Pessoa
	//public void imprime(){}

	//nao pode ser mais restritivo 
	//tipo de retorno compativel
	//mesma assinatura (nome do metodo e lista de parametros)
 
	public void imprime(){
		super.imprime();
		System.out.println("CPF: " + this.cpf);
	}




}