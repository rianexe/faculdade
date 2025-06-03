/*
 *   Alteracos para melhorar o encapsulamento 
 *   - Remocaoo do metodo para configurar diretamente produtos
 *   - Inclusao de metodos para adicionar, remover e listar os produtos  
*/
public class Fornecedor {
    private String razaoSocial;
    private Produto[] produtos;

    public Fornecedor(String razaoSocial) {
        this.produtos = new Produto[0];
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public Produto[] getProdutos() {
        return produtos;
    }
    /* Remocao do metodo setProdutos
    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
    */
    
    // Inclusao de metodo para adicionar um produto ao fornecedor  
    public void adicionaProduto(Produto produto){
	if (produto!= null){
	        //criando um array com um elemento a mais para adicionar o produto
        	Produto[] produtosExistenteMais1 = new Produto[this.produtos.length+1];
	        /* migrando os produtos existentes para um novo array
        	 * deixando a ultima posicao livre para o novo produto */
	        for (int i = 0; i < this.produtos.length; i++) {
        	    produtosExistenteMais1[i] = this.produtos[i];            
	        }
	        //adicionando 1 produto na ultima posicao
        	produtosExistenteMais1[produtosExistenteMais1.length-1] = produto;
	        //incluindo os produtos no fornecedor
        	this.produtos = produtosExistenteMais1;
	}else{
		System.out.println("Nao eh possivel adicionar produto nulo");
	}
    }

    // Inclusao de metodo para remover produto
    public void removerProduto(Produto produtoParaRemocao) {
        //criando um array com um elemento a menos 
        Produto[] produtosExistenteMenos1 = new Produto[this.produtos.length-1];
        /* migrando os produtos existentes para um novo array
         * removendo o produto desejado */
        for (int i = 0, j = 0; i < this.produtos.length; i++, j++) {            
            if(this.produtos[i].equals(produtoParaRemocao)){
                i++;
            }
            produtosExistenteMenos1[j] = this.produtos[i];
        }
        this.produtos = produtosExistenteMenos1;
    }
    
    // Inclusao de metodo para listar produtos
    public void listarProdutos(){
        System.out.println("\t#LISTAGEM DE PRODUTOS FORNECEDOR "
                            + this.getRazaoSocial()+"#");
        for (int i = 0; i < this.produtos.length; i++) {            
            System.out.println("\tProduto: " + this.produtos[i].getDescricao() 
                    + " , preco: " + this.produtos[i].getPreco());
        }
        System.out.println("\t#QTDE PRODUTOS " + this.getProdutos().length+"#");
    }

    
}
