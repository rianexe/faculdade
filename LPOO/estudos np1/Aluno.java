class Aluno extends Pessoa {	//classe Aluno herdada da classe Pessoa, buscando seus atributos e criando novos abaixo
    private String curso;

    Aluno(String nome, int idade, String curso, Endereco enderecoResidencial) {
        super(nome, idade, enderecoResidencial);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

	//Override, ou Sobreposição, consiste em utilizar um mesmo método vindo de uma classe mãe/superclasse, porém com sobreposta para executar "uma ação diferente"
	@Override
    public void exibirDados() {
		System.out.println("Exibindo dados do aluno:\nCurso: " + curso);
        super.exibirDados();
    }
}
