package com.QeT.App.Fatura;

import java.util.List;

import com.QeT.App.Pagamento.Pagamento;
import com.QeT.App.Pagamento.PagamentoBO;
import com.QeT.App.Pagamento.StatusPagamento;

public class FaturaBO extends Fatura {
    private static final FaturaBO instance = new FaturaBO();

    public static FaturaBO getInstance() {
        return instance;
    }

    public void pagarFatura(Fatura fatura, List<Pagamento> pagamentos) {
        Double somatorio = PagamentoBO.getInstance().somatorioPagamentos(pagamentos);
        if (somatorio >= fatura.getValorTotal()) {
            fatura.setStatus(StatusPagamento.PAGA);
        } else {
            fatura.setStatus(StatusPagamento.PENDENTE);
        }
    }
}
