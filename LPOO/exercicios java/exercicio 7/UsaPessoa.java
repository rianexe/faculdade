public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("rian", 20);
        Pessoa pessoa2 = new Pessoa("ana", 19);
        
        Endereco endereco1 = new Endereco("Rua UNIP", "Santana de Parnaiba", "SP");
        
        pessoa1.setEndereco(endereco1);
        
        pessoa1.imprime();
        System.out.println();
        pessoa2.imprime();
        
        System.out.println();
        Cliente cliente1 = new Cliente("edgar", "000.000.000-00");
        Cliente cliente2 = new Cliente("rayanne", 20, "111.111.111-11");
        
        cliente1.imprime();
        System.out.println();
        cliente2.imprime();
    }
}