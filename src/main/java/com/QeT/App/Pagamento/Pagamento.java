package com.QeT.App.Pagamento;

import java.util.Date;

import com.QeT.App.Boleto.Boleto;

public class Pagamento {
    private Double valorPago;
    private Date data;
    private Boleto boleto;
    private TipoPagamento tipo;

    public Pagamento() {
    }

    public Date getData() {
        return data;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    protected void setData(Date data) {
        this.data = data;
    }

    protected void setTipo(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    protected void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    protected void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }
}
