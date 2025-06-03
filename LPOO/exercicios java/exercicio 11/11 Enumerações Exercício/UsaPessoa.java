class UsaPessoa{

	public static void main(String[] args){
		System.out.println("Impressão da constante idade minima " 
				+ Pessoa.IDADE_MINIMA);
		Pessoa marcelo = new Pessoa("Marcelo",44);
		marcelo.setTipo(TipoPessoa.PJ);
		marcelo.imprime();
		
		Pessoa rian = new Pessoa("rian", 20);
		rian.setTipo(TipoPessoa.PF);
		rian.imprime();
		
		Cliente daniel = new Cliente("Daniel", 20, "111.222.333-44");
		
	}

}