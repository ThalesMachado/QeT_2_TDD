package com.QeT.App.Fatura;

import com.QeT.App.Pagamento.Pagamento;
import com.QeT.App.Pagamento.StatusPagamento;

public class FaturaBO extends Fatura {
    private static final FaturaBO instance = new FaturaBO();

    public static FaturaBO getInstance() {
        return instance;
    }

    public void pagarFatura(Fatura fatura, Pagamento pagamento) {
        if (pagamento.getValorPago() >= fatura.getValorTotal()) {
            fatura.setStatus(StatusPagamento.PAGA);
        } else {
            fatura.setStatus(StatusPagamento.PENDENTE);
        }
    }
}
