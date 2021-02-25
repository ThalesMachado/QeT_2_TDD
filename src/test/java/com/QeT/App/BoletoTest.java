package com.QeT.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.QeT.App.Boleto.Boleto;
import com.QeT.App.Boleto.BoletoBO;

import org.junit.jupiter.api.Test;

public class BoletoTest {

    @Test
    public void testaSomatorioBoleto(){
        List<Boleto> boletos = new ArrayList<Boleto>();

        boletos.add(new Boleto("a", new Date(), 200.0));
        boletos.add(new Boleto("b", new Date(), 300.0));
        boletos.add(new Boleto("c", new Date(), 500.0));
        boletos.add(new Boleto("d", new Date(), 1000.0));

        Double somatorio = BoletoBO.getInstance().somatorioBoletos(boletos);
        
        assertEquals(2000.0, somatorio);
    }
}
