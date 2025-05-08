package com.example.backend_processa_pagamento.consumer;

import com.example.backend_processa_pagamento.producer.PagamentoProducer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PagamentoRequestConsumer {
    @Autowired private PagamentoProducer pagamentoProducer;

    @RabbitListener(queues = { "pagamento-request-queue"})
    public void receberMensagem (@Payload Message message) {
        System.out.println("Processando Pagamento... " + message);
        pagamentoProducer.gerarResposta("Pagamento processado com sucesso ..." + message);
    }
}