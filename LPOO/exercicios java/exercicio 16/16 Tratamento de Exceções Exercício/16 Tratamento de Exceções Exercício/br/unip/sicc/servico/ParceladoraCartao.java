package br.unip.sicc.servico;

import br.unip.sicc.entidades.Produto;

public class ParceladoraCartao implements Parceladora{
	private double juros = 0.03;
	private int qtdeParcelas = 12;
	public static final double PARCELA_MINIMA = 5.0;

	public PlanoDePagamento parcela(Produto produto) throws ParcelamentoException {
		double valorParcela = produto.getPreco()/qtdeParcelas*(1+juros);
		if(valorParcela < PARCELA_MINIMA){ 
			throw new ParcelamentoException("Parcela invalida: " + valorParcela);
		}
		PlanoDePagamento plano = 
			new PlanoDePagamento("Cartao de credito", qtdeParcelas, valorParcela); 
		return plano;
	}
}