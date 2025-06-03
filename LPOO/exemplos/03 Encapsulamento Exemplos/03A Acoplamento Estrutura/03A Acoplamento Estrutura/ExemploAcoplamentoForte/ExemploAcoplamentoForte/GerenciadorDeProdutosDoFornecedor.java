/*
 *   Observe como esta classe manipula estruturas internas de Fornecedor (Produto[])
 *   para adicionar, remover e listar os produtos do fornecedor
 *   configurando alto acoplamento entre esta classe e a classe Fornecedor 
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
        Produto[] produtos = {tv50,tv60,tv70,geladeira,lavaLoucas};
        //incluindo os produtos no fornecedor
        samsung.setProdutos(produtos);        
        
        /* ###########################################
         * LISTAR PRODUTOS DO FORNECEDOR         
         * ########################################### */
        Produto[] produtosExistentes = samsung.getProdutos();
        System.out.println("\t#LISTAGEM DE PRODUTOS FORNECEDOR "
                            + samsung.getRazaoSocial()+"#");
        for (int i = 0; i < produtosExistentes.length; i++) {            
            System.out.println("\tProduto: " + produtosExistentes[i].getDescricao() 
                    + " , preco: " + produtosExistentes[i].getPreco());
        }
        System.out.println("\t#QTDE PRODUTOS " + samsung.getProdutos().length+"#");
        
        /* ###########################################
         * ADICIONAR UM NOVO PRODUTO NO FORNECEDOR         
         * ########################################### */
        System.out.println("ADICIONANDO UM PRODUTO AO FORNECEDOR");
        Produto celular = new Produto("Celular S 10", 3999.0);
        //recuperando o array de produtos existentes
        produtosExistentes = samsung.getProdutos();
        //criando um array com um elemento a mais para adicionar o produto
        Produto[] produtosExistenteMais1 = new Produto[produtosExistentes.length+1];
        /* migrando os produtos existentes para um novo array
         * deixando a ultima posicao livre para o novo produto */
        for (int i = 0; i < produtosExistentes.length; i++) {
            produtosExistenteMais1[i] = produtosExistentes[i];            
        }
        //adicionando 1 produto na ultima posicao
        produtosExistenteMais1[produtosExistenteMais1.length-1] = celular;
        //configurando novo array aos produtos do fornecedor
        samsung.setProdutos(produtosExistenteMais1);        
        
        /* ###########################################
         * LISTAR PRODUTOS DO FORNECEDOR         
         * ########################################### */
        produtosExistentes = samsung.getProdutos();
        System.out.println("\t#LISTAGEM DE PRODUTOS FORNECEDOR "
                            + samsung.getRazaoSocial()+"#");
        for (int i = 0; i < produtosExistentes.length; i++) {            
            System.out.println("\tProduto: " + produtosExistentes[i].getDescricao() 
                    + " , preco: " + produtosExistentes[i].getPreco());
        }
        System.out.println("\t#QTDE PRODUTOS " + samsung.getProdutos().length+"#");

        /* ###########################################
         * REMOVER UM PRODUTO DO FORNECEDOR         
         * ########################################### */
        System.out.println("REMOVENDO UM PRODUTO DO FORNECEDOR");
        Produto produtoParaRemocao = tv60;        
        //recuperando o array de produtos existentes
        produtosExistentes = samsung.getProdutos();
        //criando um array com um elemento a menos 
        Produto[] produtosExistenteMenos1 = new Produto[produtosExistentes.length-1];
        /* migrando os produtos existentes para um novo array
         * removendo o produto desejado */
        for (int i = 0, j = 0; i < produtosExistentes.length; i++, j++) {            
            if(produtosExistentes[i].equals(produtoParaRemocao)){
                i++;
            }
            produtosExistenteMenos1[j] = produtosExistentes[i];
        }
        //configurando novo array aos produtos do fornecedor
        samsung.setProdutos(produtosExistenteMenos1);
        
        /* ###########################################
         * LISTAR PRODUTOS DO FORNECEDOR         
         * ########################################### */
        produtosExistentes = samsung.getProdutos();
        System.out.println("\t#LISTAGEM DE PRODUTOS FORNECEDOR "
                            + samsung.getRazaoSocial()+"#");
        for (int i = 0; i < produtosExistentes.length; i++) {            
            System.out.println("\tProduto: " + produtosExistentes[i].getDescricao() 
                    + " , preco: " + produtosExistentes[i].getPreco());
        }
        System.out.println("\t#QTDE PRODUTOS " + samsung.getProdutos().length+"#");
        
    }
}
