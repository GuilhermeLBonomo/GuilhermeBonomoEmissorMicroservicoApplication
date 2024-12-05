package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.controllers;

import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Entities.ContaInstagram;
import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Services.ContaInstagramService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/conta-instagram")
public class ContaInstagramController {
    private ContaInstagramService contaInstagramService;

    public ContaInstagramController(ContaInstagramService contaInstagramService){
        this.contaInstagramService = contaInstagramService;
    }


    @PostMapping(value="adicionar-conta-instagram")
    public ResponseEntity<ContaInstagram> RemoverConta(@RequestBody ContaInstagram contaInstagram){
        ContaInstagram tempMedidor = contaInstagramService.remover(contaInstagram);
        return ResponseEntity.ok(tempMedidor);
    }
}
