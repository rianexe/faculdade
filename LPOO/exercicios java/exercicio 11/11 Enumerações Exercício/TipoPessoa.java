public enum TipoPessoa{
	PF("Pessoa Física"),
	PJ("Pessoa Jurídica");
	
	private String descricao;
	
	private TipoPessoa(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}

}