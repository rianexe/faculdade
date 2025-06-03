class UsaPessoa {
	public static void main(String[] args) {
		System.out.println("Idade minima a partir da classe Pessoa: " + Pessoa.IDADE_MINIMA);

		Pessoa marcelo = new Pessoa("Marcelo", 44);

		Cliente daniel = new Cliente("Daniel", 20, "111.222.333-44");

		System.out.println("Idade minima a partir da classe Pessoa: " + Pessoa.IDADE_MINIMA);
	}
}

}