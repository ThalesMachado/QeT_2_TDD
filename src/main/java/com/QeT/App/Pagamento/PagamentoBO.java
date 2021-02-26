package com.QeT.App.Pagamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.QeT.App.Boleto.Boleto;
import com.QeT.App.Fatura.Fatura;
import com.QeT.App.Fatura.FaturaBO;

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

    public Pagamento gerarPagamentoBoleto(Boleto boleto) {
        Pagamento pagamento = new Pagamento();
        pagamento.setBoleto(boleto);
        pagamento.setData(new Date());
        pagamento.setTipo(TipoPagamento.BOLETO);
        pagamento.setValorPago(boleto.getValorPago());
        return pagamento;
    }

    public Double somatorioPagamentos(List<Pagamento> pagamentos) {
        Double somatorioFinal = 0.0;

        for (Pagamento pagamento : pagamentos) {
            somatorioFinal += pagamento.getValorPago();
        }

        return somatorioFinal;
    }

    public List<Pagamento> pagarFatura(Fatura fatura, List<Boleto> boletos) {
        List<Pagamento> pagamentos = gerarPagamentosBoletos(boletos);
        FaturaBO.getInstance().pagarFatura(fatura, pagamentos);
        return pagamentos;
    }
}
