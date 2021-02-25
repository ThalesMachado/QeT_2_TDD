package com.QeT.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.QeT.App.Boleto.Boleto;
import com.QeT.App.Boleto.BoletoBO;
import com.QeT.App.Pagamento.Pagamento;
import com.QeT.App.Pagamento.PagamentoBO;
import com.QeT.App.Pagamento.TipoPagamento;

import org.junit.jupiter.api.Test;

public class PagamentoTest {
    @Test
    public void testaGerarPagamento() {
        List<Boleto> boletos = new ArrayList<Boleto>();
        boletos.add(new Boleto("a", new Date(), 100.0));
        boletos.add(new Boleto("b", new Date(), 150.0));
        boletos.add(new Boleto("c", new Date(), 175.0));
        boletos.add(new Boleto("d", new Date(), 200.0));
        Pagamento pagamento = PagamentoBO.getInstance().gerarPagamentoBoletos(boletos);
        Double somatorioValorBoletos = BoletoBO.getInstance().somatorioBoletos(boletos);
        Date hoje = new Date();
        assertEquals(pagamento.getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamento.getValorPago(), somatorioValorBoletos);
        assertEquals(pagamento.getData(), hoje);
    }
}
