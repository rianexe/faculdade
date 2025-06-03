class UsaCalculadora{
	public static void main(String[] args){
		Calculadora calc = new Calculadora();
		System.out.println(calc.listaOperacoes());


		int x=10, y=20;	
		int soma = calc.soma(x,y);
		System.out.println("Soma: " + soma);

		double precoAVista = 2000.0;
		double indiceDeCorrecao = 0.2;
		System.out.println("Preco a vista: " + precoAVista);
		double precoAPrazo = 
			calc.aplicaCorrecao(precoAVista, indiceDeCorrecao); 

		System.out.println("Preco a prazo: " + precoAPrazo);
		

	}
}