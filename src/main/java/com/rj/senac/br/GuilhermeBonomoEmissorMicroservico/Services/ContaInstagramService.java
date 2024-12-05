package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Services;

import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Entities.ContaInstagram;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaInstagramService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public ContaInstagram remover(ContaInstagram contaInstagram) {
        rabbitTemplate.convertAndSend("conta-instagram-request-exchange",
                "conta-instagram-request-rout-key",
                contaInstagram);

        System.out.println("Conta Instagram removida: " + contaInstagram);
        return contaInstagram;
    }

    @RabbitListener(queues = "conta-instagram-remover-queue")
    private void subscribe(ContaInstagram contaInstagram) {
        System.out.println("Recebido do RabbitMQ para remoção: " + contaInstagram);
        System.out.println("Conta Instagram removida com sucesso: " + contaInstagram);
    }
}
