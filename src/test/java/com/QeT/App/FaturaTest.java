package com.QeT.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.QeT.App.Boleto.Boleto;
import com.QeT.App.Fatura.Fatura;
import com.QeT.App.Fatura.FaturaBO;
import com.QeT.App.Pagamento.Pagamento;
import com.QeT.App.Pagamento.PagamentoBO;
import com.QeT.App.Pagamento.StatusPagamento;

public class FaturaTest {
    @Test
    public void testaPagamentoFatura() {
        List<Boleto> boletos = new ArrayList<Boleto>();
        boletos.add(new Boleto("a", new Date(), 100.0));
        Fatura fatura = new Fatura("João Semgraça", 100.0, new Date());
        Pagamento pagamento = PagamentoBO.getInstance().gerarPagamentoBoletos(boletos);
        FaturaBO.getInstance().pagarFatura(fatura, pagamento);
        assertEquals(StatusPagamento.PAGA, fatura.getStatus());
    }
}
