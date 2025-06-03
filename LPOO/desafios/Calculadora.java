import java.util.Scanner;
class Calculadora{
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);	
	int operacao;
	
	do {
		System.out.println("Bem vindo a calculadora, escolha uma operacao:");
		System.out.println("1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n0 - Sair");
	
		operacao = scanner.nextInt();
	
		if (operacao == 0){
			System.out.println("Encerrando a calculadora.");
			break;
		}
		System.out.println("Escolha o primeiro numero: ");
		double num1 = scanner.nextDouble();

		System.out.println("Escolha o segundo numero: ");
		double num2 = scanner.nextDouble();

		Operacoes resultado = new Operacoes();

		switch(operacao){
			case 1:
				resultado.soma(num1, num2);
				resultado.imprime();
				break;
			case 2:
				resultado.sub(num1, num2);
				resultado.imprime();
				break;
			case 3:
				resultado.multi(num1, num2);
				resultado.imprime();
				break;
			case 4:
				resultado.divisao(num1, num2);
				resultado.imprime();
				break;
			default:
				System.out.println("Operacao invalida");
			}
	} while (true);
	scanner.close();
}
}

