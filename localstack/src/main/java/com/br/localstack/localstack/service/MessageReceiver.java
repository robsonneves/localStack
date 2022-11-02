package com.br.localstack.localstack.service;

import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

    //Informando o nome da fila a ser pesquisada e a política da deleção
    @SqsListener(value = "${aws.queue.name}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void receiveMessage(String message) {

        //logger.info("message received {} {}", message);
        System.out.println(message);

    }
}
