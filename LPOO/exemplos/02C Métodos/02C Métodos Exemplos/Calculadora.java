class Calculadora{

	//tipo de retorno int
	//nome do metodo soma
	//lista de parametros (int a, int b)
	int soma(int a, int b){
		int resultado = a + b;
		return resultado; // compativel com o tipo de retorno declarado
	}

	double aplicaCorrecao(double valor, double indice){
		if(indice < 0.0){
			System.out.println("Indice de aumento invalido!");
			return valor;
		}else{
			return valor * (1+indice);
		}
	}

	String listaOperacoes(){
		return "\tsoma(int a, int b)\n\taplicaCorrecao(double valor, double indice)";
	}

}