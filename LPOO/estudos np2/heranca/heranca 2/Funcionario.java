public class Funcionario{
	public String nome;
	public double salario;
	
	Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public void exibirDados(){
		System.out.println("Funcionario - Nome: " + nome + "\nSalario: " + salario);
	}
}