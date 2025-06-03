public class Gerente extends Funcionario{
	public String departamento;
	
	Gerente(String nome, double salario, String departamento){
		super(nome, salario);
		this.departamento = departamento;
	}
	
	@Override
	public void exibirDados(){
		System.out.println("Funcionario - Nome: " + nome + "\nSalario: " + salario + "\nDepartamento: " + departamento);
	}
}