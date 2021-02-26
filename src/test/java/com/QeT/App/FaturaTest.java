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
        Boleto boleto = new Boleto("a", new Date(), 100.0);
        Fatura fatura = new Fatura("João Semgraça", 100.0, new Date());
        List<Pagamento> pagamentos = new ArrayList<Pagamento>();
        pagamentos.add(PagamentoBO.getInstance().gerarPagamentoBoleto(boleto));
        FaturaBO.getInstance().pagarFatura(fatura, pagamentos);
        assertEquals(StatusPagamento.PAGA, fatura.getStatus());
    }
}
