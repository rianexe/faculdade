public class UsaPessoa { 
    public static void main(String[] args) {
        // Imprime o valor da idadeMinima antes de qualquer alteração
        System.out.println("Idade mínima a partir da classe Pessoa " + Pessoa.getIdadeMinima());

        // Cria objetos do tipo Cliente e Pessoa
        Cliente daniel = new Cliente("Daniel", 20, "111.222.333-44");
        daniel.imprime();

        Cliente celia = new Cliente("Celia", "222.333.444-55");
        celia.imprime();

        Endereco endereco = new Endereco("Rua das Flores", "Sao Paulo", "SP");

        // Cria um objeto do tipo Pessoa
        Pessoa marcelo = new Pessoa("Marcelo", 44);
        marcelo.setEndereco(endereco);
        marcelo.imprime();

        // Alterando a idade mínima usando o método setIdadeMinima
        Pessoa.setIdadeMinima(21);

        // Imprime o valor da idadeMinima novamente após a alteração
        System.out.println("Idade mínima a partir da classe Pessoa " + Pessoa.getIdadeMinima());
    }
}
