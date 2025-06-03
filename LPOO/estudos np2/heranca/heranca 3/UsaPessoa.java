public class UsaPessoa {
    public static void main(String[] args) {
        Aluno edgar = new Aluno("Edgar", 19, 22222);
        edgar.estudar();

        Professor rian = new Professor("Rian", 20, 11111);
        rian.ensinar();

        rian.exibirDados();
        edgar.exibirDados();
    }
}