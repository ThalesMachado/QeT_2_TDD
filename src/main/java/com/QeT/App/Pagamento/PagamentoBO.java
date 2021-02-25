package com.QeT.App.Pagamento;

import java.util.Date;
import java.util.List;

import com.QeT.App.Boleto.Boleto;

public class PagamentoBO extends Pagamento {
    private static final PagamentoBO instance = new PagamentoBO();

    public static PagamentoBO getInstance(){
        return instance;
    }

    public Pagamento gerarPagamentoBoletos(List<Boleto> boletos){
        Double valorTotal = 0.0;
        Pagamento pagamentoGerado = new Pagamento();
        
        for (Boleto b : boletos) {
            valorTotal += b.getValorPago();
        }

        pagamentoGerado.setData(new Date());
        pagamentoGerado.setTipo(TipoPagamento.BOLETO);
        pagamentoGerado.setValorPago(valorTotal);

        return pagamentoGerado;

    }
}
