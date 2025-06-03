public class Operacoes{
	public double resultado;
	
	public void soma(double num1, double num2){
	resultado = num1 + num2;
}

	public void sub(double num1, double num2){
	resultado = num1 - num2;
}

	public void multi(double num1, double num2){
	resultado = num1 * num2;
}

	public void divisao(double num1, double num2){
	if (num2 == 0){
		System.out.println("Erro: divisao por zero nao permitida");
		resultado = 0;
	} else {
		resultado = num1 / num2;
	}
}

	public void imprime(){
		System.out.println("O resultado e: " + resultado);
	}
}

