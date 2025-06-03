package br.unip.sicc.servico;

import br.unip.sicc.entidades.Produto;

public interface Parceladora {

    public abstract PlanoDePagamento parcela(Produto produto) throws ParcelamentoException;
}
