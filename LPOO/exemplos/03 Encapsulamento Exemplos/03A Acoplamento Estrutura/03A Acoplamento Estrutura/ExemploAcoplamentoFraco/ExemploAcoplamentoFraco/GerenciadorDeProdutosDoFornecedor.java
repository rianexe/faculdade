/**
  *   Observe como esta classe nao manipula estruturas internas de 
  *   Fornecedor (Produto[]) devido ao encapsulamento aplicado com 
  *   a remoção do metodo para configurar diretamente a lista setProdutos
  *   e a inclusao de metodos para adicionar, remover e listar os produtos 
  *   do fornecedor diminuindo o acoplamento entre esta classe e a classe Fornecedor 
  *   apresentado no exemplo anterior
*/

public class GerenciadorDeProdutosDoFornecedor{
    public static void main(String[] args) {
        /* ###########################################
         * CRIANDO O FORNECEDOR COM CINCO PRODUTOS
         * ########################################### */
        System.out.println("CRIANDO O FORNECEDOR COM CINCO PRODUTOS");
        Fornecedor samsung = new Fornecedor("Samsung");
        Produto tv50 = new Produto("TV 50 polegadas", 2999.0);
        Produto tv60 = new Produto("TV 60 polegadas", 4999.0);
        Produto tv70 = new Produto("TV 70 polegadas", 9999.0);
        Produto geladeira = new Produto("Geladeira 200 litros", 3999.0);
        Produto lavaLoucas = new Produto("Lava Loucas", 3999.0);
        
        //incluindo os produtos no fornecedor
        samsung.adicionaProduto(tv50);
        samsung.adicionaProduto(tv60);
        samsung.adicionaProduto(tv70);
        samsung.adicionaProduto(geladeira);
        samsung.adicionaProduto(lavaLoucas);
        
        /* ###########################################
         * LISTAR PRODUTOS DO FORNECEDOR         
         * ########################################### */
        samsung.listarProdutos();
        
        /* ###########################################
         * ADICIONAR UM NOVO PRODUTO NO FORNECEDOR         
         * ########################################### */
        System.out.println("ADICIONANDO UM PRODUTO AO FORNECEDOR");
        Produto celular = new Produto("Celular S 10", 3999.0);
        samsung.adicionaProduto(celular);
        
        /* ###########################################
         * IMPRIME LISTA DE PRODUTOS DO FORNECEDOR         
         * ########################################### */
        samsung.listarProdutos();

        /* ###########################################
         * REMOVER UM PRODUTO DO FORNECEDOR         
         * ########################################### */
        System.out.println("REMOVENDO UM PRODUTO DO FORNECEDOR");
        Produto produtoParaRemocao = tv60;        
        samsung.removerProduto(tv60);
        
        /* ###########################################
         * IMPRIME LISTA DE PRODUTOS DO FORNECEDOR         
         * ########################################### */
        samsung.listarProdutos();
    }
}
