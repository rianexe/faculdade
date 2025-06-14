package br.unip.sicc.entidades;

import br.unip.sicc.servico.*;

public enum Unidade{
            B("Byte"), KB("Kilobyte"), MB("Megabyte"), GB("Gigabyte");
            
            private String descricao;
            
            private Unidade(String descricao){
                this.descricao = descricao;
            }
            
            public String getDescricao(){
                return this.descricao;
            }

}