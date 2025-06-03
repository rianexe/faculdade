public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("rian", 20);
        Pessoa pessoa2 = new Pessoa("ana", 19);
        
        Endereco endereco1 = new Endereco("Rua UNIP", "Santana de Parnaiba", "SP");
        Endereco endereco2 = new Endereco("Avenida Yojiro Takaoka", "Barueri", "SP");

        pessoa1.setEndereco(endereco1);
        pessoa2.setEndereco(endereco2);

        pessoa1.imprime();
        System.out.println();
        pessoa2.imprime();
    }
}