public class UsaFuncionario{
	public static void main (String[]args){
		Funcionario joao = new Funcionario("Joao", 1500.00);
		joao.exibirDados();
		
		Gerente rian = new Gerente("rian", 10000.00, "TI");
		rian.exibirDados();
	}
}