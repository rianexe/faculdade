package br.unip.sicc.servico;

import br.unip.sicc.entidades.*;

public class ParceladoraCheque implements Parceladora{
        private double juros = 0.04;
        private int qtdeParcelas = 6;
        
        public PlanoDePagamento parcela(Produto produto){
            double valorParcela = produto.getPreco()/qtdeParcelas*(1+juros);
            PlanoDePagamento plano = new PlanoDePagamento("Cheque", qtdeParcelas, valorParcela);
                    return plano;
        }
        
    }

