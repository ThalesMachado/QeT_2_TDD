package com.QeT.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.QeT.App.Boleto.Boleto;
import com.QeT.App.Fatura.Fatura;
import com.QeT.App.Pagamento.Pagamento;
import com.QeT.App.Pagamento.PagamentoBO;
import com.QeT.App.Pagamento.StatusPagamento;
import com.QeT.App.Pagamento.TipoPagamento;

import org.junit.jupiter.api.Test;

public class PagamentoTest {
    @Test
    public void testaGerarPagamentos() {
        List<Boleto> boletos = new ArrayList<Boleto>();
        boletos.add(new Boleto("a", new Date(), 100.0));
        boletos.add(new Boleto("b", new Date(), 150.0));
        boletos.add(new Boleto("c", new Date(), 175.0));
        boletos.add(new Boleto("d", new Date(), 200.0));

        List<Pagamento> pagamentos = PagamentoBO.getInstance().gerarPagamentosBoletos(boletos);
        Double somatorio = PagamentoBO.getInstance().somatorioPagamentos(pagamentos);
        assertEquals(pagamentos.size(), 4);
        assertEquals(625.0, somatorio);
    }

    @Test
    public void testaGerarPagamentoBoleto() {
        Boleto boleto = new Boleto("a", new Date(), 1000.0);
        Pagamento pagamento = PagamentoBO.getInstance().gerarPagamentoBoleto(boleto);

        assertEquals(boleto.getValorPago(), pagamento.getValorPago());
        assertEquals(TipoPagamento.BOLETO, pagamento.getTipo());
    }

    @Test
    public void testaPagamentoFatura() {
        List<Boleto> boletos = new ArrayList<Boleto>();
        boletos.add(new Boleto("a", new Date(), 500.0));
        boletos.add(new Boleto("a", new Date(), 400.0));
        boletos.add(new Boleto("a", new Date(), 600.0));

        Fatura fatura = new Fatura("João Tristinho", 1500.0, new Date());

        List<Pagamento> pagamentos = PagamentoBO.getInstance().pagarFatura(fatura, boletos);

        assertEquals(3, pagamentos.size());
        assertEquals(fatura.getStatus(), StatusPagamento.PAGA);
    }
}
