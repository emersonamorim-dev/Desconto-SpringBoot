package com.desconto.DescontoSpringBoot.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Cliente {
    private int clienteId;
    private String nome;
    private String tipo;
    private int anos;

    public Cliente(int clienteId, String nome, String tipo, int anos) {
        super();
        this.clienteId = clienteId;
        this.nome = nome;
        this.tipo = tipo;
        this.anos = anos;

    }

    public Cliente(int clienteId, String nome, String tipo) {
        super();
        this.clienteId = clienteId;
        this.nome = nome;
        this.tipo = tipo;

    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
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

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

}
