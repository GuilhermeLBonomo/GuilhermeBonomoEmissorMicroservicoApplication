package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class GuilhermeBonomoEmissorMicroservicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuilhermeBonomoEmissorMicroservicoApplication.class, args);
	}

}
