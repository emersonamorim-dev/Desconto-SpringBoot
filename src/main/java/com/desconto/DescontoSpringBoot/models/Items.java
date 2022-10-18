package com.desconto.DescontoSpringBoot.models;

public class Items {
    private String nome;
    private String tipo;
    private double preco;
    private int quantidade;

    public Items(String nome, String tipo, double preco, int quantidade) {
        super();
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
