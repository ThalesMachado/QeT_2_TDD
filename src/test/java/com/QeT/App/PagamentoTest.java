package com.QeT.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.QeT.App.Boleto.Boleto;

import org.junit.jupiter.api.Test;

public class PagamentoTest {
    @Test
    public void testaGerarPagamento(){
        List<Boleto> boletos = new ArrayList<Boleto>();
        Pagamento pagamento = PagamentoBO.getInstance().gerarPagamento(boletos);
        Double somatorioValorBoletos = BoletoBo.getInstante().somarBoletos(boletos);
        Date hoje = new Date();
        assertEquals(pagamento.tipo, "BOLETO");
        assertEquals(pagamento.valorPago, somatorioValorBoletos);
        assertEquals(pagamento.data, hoje);
    }
}
