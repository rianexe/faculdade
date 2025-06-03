class Funcionario extends Pessoa {	//classe Funcionario herdada da classe Pessoa, buscando seus atributos e criando novos abaixo
    private String cargo;
    private double salario;

    Funcionario(String nome, int idade, String cargo, double salario, Endereco enderecoResidencial, Endereco enderecoTrabalho) {
        super(nome, idade, enderecoResidencial, enderecoTrabalho);
        this.cargo = cargo;  
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
	
	//Override, ou Sobreposição, consiste em utilizar um mesmo método vindo de uma classe mãe/superclasse, porém com sobreposta para executar "uma ação diferente"
	@Override
    public void exibirDados() {
		System.out.println("Exibindo dados do funcionario: ");
        super.exibirDados();		
        System.out.println("\nCargo: " + cargo);
        System.out.println("\nSalario: " + salario);
    }
}