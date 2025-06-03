public class UsaPessoa {
    public static void main(String[] args) {
		
		//criando novos objetos de endereço, aluno e funcionário, caso quisesse poderia criar como pessoa também, porém não teria atributos como cargo, curso, etc.
        Endereco aluno1endres = new Endereco("Rua Jogos", 152, "Carapicuiba");
        Aluno a1 = new Aluno("Rian", 17, "Jogos Digitais", aluno1endres);
        a1.exibirDados();

        System.out.println("\n=========================================\n");

        Endereco func1endres = new Endereco("Rua Sandra", 999, "Sandropolis");
        Endereco func1endtrab = new Endereco("Trab Sandra", 888, "Trabalho");
        Funcionario f1 = new Funcionario("Sandra", 55, "Lider de Producao", 5000.99, func1endres, func1endtrab);
        f1.exibirDados();
    }
}