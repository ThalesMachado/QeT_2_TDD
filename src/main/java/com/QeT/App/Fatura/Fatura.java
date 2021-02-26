package com.QeT.App.Fatura;

import java.util.Date;

import com.QeT.App.Pagamento.StatusPagamento;

public class Fatura {
    private Date data;
    private Double valorTotal;
    private String nomeCliente;
    protected StatusPagamento status;

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

    public StatusPagamento getStatus() {
        return status;
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

    protected void setStatus(StatusPagamento status) {
        this.status = status;
    }

}
