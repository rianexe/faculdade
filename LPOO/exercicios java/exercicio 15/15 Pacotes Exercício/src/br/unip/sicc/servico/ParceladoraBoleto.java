package br.unip.sicc.servico;

import br.unip.sicc.entidades.*;

public class ParceladoraBoleto implements Parceladora{
    
     	private double juros = 0.05;
        private int qtdeParcelas = 10;
        
        public PlanoDePagamento parcela(Produto produto){
            double valorParcela = produto.getPreco()/qtdeParcelas*(1+juros);
            PlanoDePagamento plano = new PlanoDePagamento("Boleto", qtdeParcelas, valorParcela);
                    return plano;
        }
        
    }