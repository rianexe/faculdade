public class Endereco{
	private String rua;
	private String cidade;
	private String estado;

	public Endereco(String rua, String cidade, String estado){
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
}

	public String getRua(){
		return this.rua;
	}

	public void setRua(String rua){
		this.rua = rua;
	}	

	public String getCidade(){
		return this.cidade;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}	

	public String getEstado(){
		return this.estado;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}	

	public void imprime(){
		System.out.println("Endereco: " + rua +", "+ cidade +", "+ estado);
	}

}