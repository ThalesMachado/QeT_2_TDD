package com.QeT.App.Pagamento;

public class PagamentoBO extends Pagamento {
    private static final PagamentoBO instance = new PagamentoBO();

    public static PagamentoBO getInstance(){
        return instance;
    }
}
