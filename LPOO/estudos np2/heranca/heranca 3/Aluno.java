public class Aluno extends Pessoa {
    private int matricula;

    Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void estudar() {
        System.out.println("O aluno esta estudando...");
    }

    @Override
    public void exibirDados() {
        System.out.println(getNome() + ", " + getIdade() + ", " + matricula);
    }
}
