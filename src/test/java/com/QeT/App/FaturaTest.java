package test.java.com.QeT.App;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.com.QeT.App.Boleto.Boleto;
import main.java.com.QeT.App.Fatura.Fatura;
import main.java.com.QeT.App.Fatura.FaturaBO;

public class FaturaTest {
    @Test
    public void testaPagamentoFatura() {
        List<Boleto> boletos = new ArrayList<Boleto>();
        boletos.add(new Boleto(100, new Date(), "12345"));
        Fatura fatura = new Fatura("João Semgraça", 100.0, new Date());
        Boolean faturaEstaPaga = FaturaBO.faturaEstaPaga(fatura, boletos);
        Assertions.assertEquals(true, faturaEstaPaga);
    }
}
