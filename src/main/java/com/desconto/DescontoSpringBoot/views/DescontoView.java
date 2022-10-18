package com.desconto.DescontoSpringBoot.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desconto.DescontoSpringBoot.controllers.DescontoController;
import com.desconto.DescontoSpringBoot.models.Conta;

@RestController
@RequestMapping("/api/v2")
public class DescontoView {

    @Autowired
    private DescontoController descontoController;

    @PostMapping("/verDesconto")
    public Conta createConta(@RequestBody Conta conta) {
        return descontoController.calcularConta(conta);

    }

}
