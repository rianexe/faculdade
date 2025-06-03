package br.unip.sicc.app;

import br.unip.sicc.entidades.*;
import br.unip.sicc.servico.*;

public class UsaProduto {

    public static void main(String[] args) {
	//Date agora = new Date();
	//System.out.printf("Hoje eh dia %1$tD %n",agora);	

        ProdutoDigital ebook = new ProdutoDigital("Java para iniciantes", 50.0);
	ebook.setTamanho(150.0);
	ebook.setUnidade(Unidade.KB);

        ImpressoraProduto impressoraXml = new ImpressoraProdutoXml();
        ImpressoraProduto impressoraPipe = new ImpressoraProdutoPipe();

	ImpressoraProduto[] impressoras = {impressoraXml, impressoraPipe};

	for(ImpressoraProduto impressora: impressoras){
	        impressora.setProduto(ebook);
        	impressora.imprimeProduto();
	        System.out.println("");
	}

        Produto tv = new Produto("Tv", 3500.0);
        tv.imprime();

        Parceladora parceladoraCartao = new ParceladoraCartao();
        Parceladora parceladoraCheque = new ParceladoraCheque();
        Parceladora parceladoraBoleto = new ParceladoraBoleto();

	Parceladora[] parceladoras = {parceladoraCheque, parceladoraCartao, parceladoraBoleto};

	for(Parceladora parceladora: parceladoras){
	    System.out.println("============================================");
	    PlanoDePagamento plano = parceladora.parcela(tv); 
	    plano.imprime();
	}
	System.out.println("============================================");

    }
}
