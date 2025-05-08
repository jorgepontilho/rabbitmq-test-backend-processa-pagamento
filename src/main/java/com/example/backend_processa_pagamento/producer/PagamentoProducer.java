package com.example.backend_processa_pagamento.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoProducer {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void gerarResposta(String mensagem){
        amqpTemplate.convertAndSend(
                "pagamento-response-exchange",
                "pagamento-response-rout-key",
                mensagem);
    }
}