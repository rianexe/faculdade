package br.unip.sicc.app;

import br.unip.sicc.entidades.Produto;
import br.unip.sicc.servico.*;

public class UsaProduto {

    public static void main(String[] args){

        Produto mochila = new Produto("Mochila grande", 90.0);
        mochila.imprime();

		try{
			Parceladora parceladoraCartao = new ParceladoraCartao();
			PlanoDePagamento planoCartao = parceladoraCartao.parcela(mochila);
			planoCartao.imprime();
			
			Parceladora parceladoraCheque = new ParceladoraCheque();
			PlanoDePagamento planoCheque = parceladoraCheque.parcela(mochila);
			planoCheque.imprime();
			
			Parceladora parceladoraBoleto = new ParceladoraBoleto();
			PlanoDePagamento planoBoleto = parceladoraBoleto.parcela(mochila);
			planoBoleto.imprime();
		} catch (ParcelamentoException e){
			System.out.println("Erro no parcelamento: " + e.getMessage());
		} finally {
			System.out.println("Processo de parcelamento finalizado.");
		}
    }
}





