package com.desconto.DescontoSpringBoot.models;

import org.springframework.stereotype.Component;

public class Conta {

    private int clienteId;
    private double desconto;
    private Items[] items;
    private double initialTotal;
    private double total;

    public Conta(int clienteId, Items[] list) {
        super();
        this.clienteId = clienteId;
        this.items = list;
        this.desconto = 0;
        this.total = 0;
        this.initialTotal = 0;
    }

    public Conta() {

    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    public double getInitialTotal() {
        return initialTotal;
    }

    public void setInitialTotal(double initialTotal) {
        this.initialTotal = initialTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
