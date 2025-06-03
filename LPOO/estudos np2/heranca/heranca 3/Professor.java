public class Professor extends Pessoa {
    private double salario;

    Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void ensinar() {
        System.out.println("O professor esta ensinando...");
    }

    @Override
    public void exibirDados() {
        System.out.println(getNome() + ", " + getIdade() + ", " + salario);
    }
}
