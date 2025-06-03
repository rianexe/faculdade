package br.unip.sicc.servico;

import br.unip.sicc.entidades.*;

public class ImpressoraProdutoPipe extends ImpressoraProduto{


	public void imprimeProduto(){
		if(valida()){
			System.out.println(produto.getDescricao()+"|"
                                + produto.getPreco());
		}
	}
	

}