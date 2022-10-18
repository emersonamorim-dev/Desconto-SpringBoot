package com.desconto.DescontoSpringBoot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.desconto.DescontoSpringBoot.models.Cliente;
import com.desconto.DescontoSpringBoot.models.Conta;
import com.desconto.DescontoSpringBoot.views.DescontoView;

@Component
public class DescontoController {

    @Autowired

    private DescontoView view; //

    //
    public Conta calcularConta(Conta conta) {
        List<Cliente> database = generateClientes();// gera uma lista de objetos por cliente

        // obter o desconto para a conta
        double desconto = getDesconto(conta, database);

        // obter o total da conta
        double initialTotal = getTotal(conta);
        double total = initialTotal - desconto; // obter o total e subtrair o desconto

        // definir o total e o desconto para a fatura
        conta.setDesconto(desconto);
        conta.setTotal(total);
        conta.setInitialTotal(initialTotal);
        return conta;
    }

    // Para gerar uma lista de pessoas para imitar o armazenamento de banco de dados
    public List<Cliente> generateClientes() {
        List<Cliente> list = new ArrayList<Cliente>();

        // Cria lista 5 Clientes

        Cliente desconto5 = new Cliente(1, "Helloysa", "Desconto 5%", 1);
        Cliente desconto7 = new Cliente(2, "Eduarda", "Desconto 7%", 2);
        Cliente desconto10 = new Cliente(3, "Marcela", "Desconto 10%", 3);

        // adicionando a uma lista
        list.add(desconto5);
        list.add(desconto7);
        list.add(desconto10);

        return list;

    }

    // Obter o valor da porcentagem de desconto
    public double getDesconto(Conta conta, List<Cliente> list) {

        // obter fatura total para descontos baseados em porcentagem
        double descontoTotal = getDescontoTotal(conta);
        double desconto = 0;
        // obter a fatura total
        double total = getTotal(conta);

        // obter o tipo de cliente
        Cliente cliente = getCliente(conta.getClienteId(), list);
        // Define o maior valor de desconto primeiro, caso um cliente

        if (cliente.getTipo() == "Desconto 5%") {
            if (cliente.getAnos() >= 1)
                desconto = (descontoTotal * 0.05);
        } else if (cliente.getTipo() == "Desconto 7%") {
            if (cliente.getAnos() >= 2)
                desconto = (descontoTotal * 0.07);
        } else if (cliente.getTipo() == "Desconto 10%") {
            if (cliente.getAnos() >= 3)
                desconto = (descontoTotal * 0.1);
        }

        // Para cada compra R$ 10.000 na loja, haverá um desconto de 5%, 7% ou 10%
        for (int i = 10000; i < (int) total; i += 100) {
            desconto += 50.0;
        }

        return desconto;
    }

    // Para obter o total de todos os produtos
    public double getTotal(Conta conta) {
        double total = 0;

        for (int i = 0; i < conta.getItems().length; i++) {
            total += (conta.getItems()[i].getPreco() * (double) conta.getItems()[i].getQuantidade());
        }

        return total;
    }

    // Para obter o total com desconto de todos os produtos
    public double getDescontoTotal(Conta conta) {
        double descontoTotal = 0;

        for (int i = 0; i < conta.getItems().length; i++) {
            if (conta.getItems()[i].getTipo().equals("eletronicos, celular"))
                continue;
            else
                descontoTotal += (conta.getItems()[i].getPreco()
                        * (double) conta.getItems()[i].getQuantidade());
        }

        return descontoTotal;
    }

    // Para obter o cliente
    public Cliente getCliente(int id, List<Cliente> list) {

        // Verificação do tipo de clientes
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getClienteId())
                return list.get(i);
        }

        // Supondo que eles não existam, então um novo cliente, eles serão criados
        return new Cliente(id, "generic", "", 0);
    }
}
