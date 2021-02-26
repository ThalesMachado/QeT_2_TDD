package com.QeT.App.Pagamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.QeT.App.Boleto.Boleto;

public class PagamentoBO extends Pagamento {
    private static final PagamentoBO instance = new PagamentoBO();

    public static PagamentoBO getInstance() {
        return instance;
    }

    public List<Pagamento> gerarPagamentosBoletos(List<Boleto> boletos) {
        List<Pagamento> pagamentoGerado = new ArrayList<Pagamento>();

        for (Boleto b : boletos) {
            Pagamento p = new Pagamento();
            p.setData(new Date());
            p.setTipo(TipoPagamento.BOLETO);
            p.setValorPago(b.getValorPago());
            p.setBoleto(b);
            pagamentoGerado.add(p);
        }

        return pagamentoGerado;

    }

    public Double somatorioPagamentos(List<Pagamento> pagamentos){
        Double somatorioFinal = 0.0;

        for (Pagamento pagamento : pagamentos) {
            somatorioFinal += pagamento.getValorPago();
        }

        return somatorioFinal;
    }
}
