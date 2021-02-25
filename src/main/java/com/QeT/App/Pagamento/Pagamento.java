package com.QeT.App.Pagamento;

import java.sql.Date;

public class Pagamento {
    protected Double valorPago;
    protected Date data;
    protected TipoPagamento tipo;

    public Pagamento(){}

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
