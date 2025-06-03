package br.unip.sicc.entidades;

import br.unip.sicc.servico.*;

public class Produto {

    private String descricao; //null

    private double preco;

    private Fornecedor fornecedor;

    //CONSTANTE da classe 
    public static final double PRECO_MINIMO = 0.01;

    public Produto(String descricao, double preco) {
        this(descricao); // PCC
        this.setPreco(preco);
    }

    public Produto(String descricao) {
        this.setDescricao(descricao);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setPreco(double preco) {
        if (preco < Produto.PRECO_MINIMO) {
            System.out.println("Preco invalido: " + preco);
        } else {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    //Atencao ao tipo de retorno
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public String toString() {
        return "Produto{descricao:" + this.descricao + "}";
    }

    public void imprime() {
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Preco: " + this.preco);
        if (this.fornecedor != null) {
            this.fornecedor.imprime();
        }
    }

}
