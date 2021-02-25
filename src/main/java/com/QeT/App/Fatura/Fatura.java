package com.QeT.App.Fatura;

import java.util.Date;

public class Fatura {
    private Date data;
    private Double valorTotal;
    private String nomeCliente;

    public Fatura(String nomeCliente, Double valorTotal, Date data) {
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
    }

    public Fatura() {
    }

    public Date getData() {
        return data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
