package com.br.localstack.localstack.service;

import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class MessageSenderWithTemplate {

    // Usando o nome da fila como String
    @Value("${aws.queue.name}")
    private String TEST_QUEUE;
    // Injetando o Bean criado na classe de Configuração
    @Autowired
    private QueueMessagingTemplate messagingTemplate;

    public void send(final String queueName, final String messagePayload) {

        /*
         * As mensagens são criadas usando a classe auxiliar do MessageBuilder.
         * O MessageBuilder fornece dois métodos de fábrica para criar mensagens.
         * Por meio de uma mensagem já existente ou com um objeto Payload.
         **/
//        Message<String> msg = MessageBuilder.withPayload(messagePayload)
//                .setHeader("TransactionId", "123")
//                .setHeaderIfAbsent("country", "BR")
//                .build();

        // Enviando a mensagem criada para o a fila "testQueue"
        //messagingTemplate.convertAndSend(TEST_QUEUE, msg);

        System.out.println(queueName);
        System.out.println(messagePayload);
    }
}
