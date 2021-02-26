package com.QeT.App;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.QeT.App.Boleto.Boleto;
import com.QeT.App.Fatura.Fatura;
import com.QeT.App.Fatura.FaturaBO;

public class FaturaTest {
    @Test
    public void testaPagamentoFatura() {
        List<Boleto> boletos = new ArrayList<Boleto>();
        boletos.add(new Boleto("a", new Date(), 100.0));
        Fatura fatura = new Fatura("João Semgraça", 100.0, new Date());
        Boolean faturaEstaPaga = FaturaBO.faturaEstaPaga(fatura, boletos);
        Assertions.assertEquals(true, faturaEstaPaga);
    }
}
