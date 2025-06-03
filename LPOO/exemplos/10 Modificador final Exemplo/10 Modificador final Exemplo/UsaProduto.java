public class UsaProduto {

    public static void main(String[] args) {
        System.out.println("Imprimindo a constante da classe Produto (static final)");
        System.out.println("Valor minimo: " + Produto.PRECO_MINIMO);

        //variavel numero local final, nao pode ser atribuida mais de uma vez
	final int numero = 10;
	//numero = 20;

        //variavel mochila local final, nao pode ser atribuida mais de uma vez
        final Produto mochila = new Produto("Mochila Grande", 50.0);
        //mochila = new Produto("Mochila chic");
        mochila.setDescricao("Mochila chic");
        mochila.setPreco(500.0);
        mochila.imprime();

        Produto ps2 = new Produto("Playstation 2");

        ProdutoDigital ebook = new ProdutoDigital("Java 8", 80.0);
        ebook.imprime();

    }
}
