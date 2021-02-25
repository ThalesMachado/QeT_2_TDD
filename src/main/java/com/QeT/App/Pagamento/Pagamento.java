package com.QeT.App.Pagamento;

import java.util.Date;

public class Pagamento {
    protected Double valorPago;
    protected Date data;
    protected TipoPagamento tipo;

    public Pagamento(){}

    public Date getData() {
        return data;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public Double getValorPago() {
        return valorPago;
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
}
