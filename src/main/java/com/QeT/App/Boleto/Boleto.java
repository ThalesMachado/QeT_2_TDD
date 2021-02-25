package com.QeT.App.Boleto;

import java.util.Date;

public class Boleto {

    private String codigoBoleto;
    private Date data;
    private Double valorPago;

    public Boleto(String codigoBoleto, Date data, Double valorPago){
        this.codigoBoleto = codigoBoleto;
        this.data = data;
        this.valorPago = valorPago;
    }

    public Boleto(){
    }

    public String getCodigoBoleto() {
        return codigoBoleto;
    }

    public Date getData() {
        return data;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setCodigoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
}
