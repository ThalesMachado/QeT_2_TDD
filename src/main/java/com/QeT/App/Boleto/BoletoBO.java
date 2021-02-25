package com.QeT.App.Boleto;

import java.util.List;

public class BoletoBO {

    private static final BoletoBO instance = new BoletoBO();
    
    public static BoletoBO getInstance(){
        return instance;
    }

    public Double somatorioBoletos(List<Boleto> boletos){
        Double resultado = 0.0;

        for (Boleto boleto : boletos) {
            resultado += boleto.getValorPago();
        }

        return resultado;
    }

}
