package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Services;

import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Entities.Prato;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PratoService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public Prato adicionar(Prato prato) {
        rabbitTemplate.convertAndSend("fila-restaurante", prato);
        return prato;
    }

    @RabbitListener(queues = "fila-restaurante")
    private void subscribe(Prato prato) {
        System.out.println("Recebido do RabbitMQ: " + prato);
    }
}
