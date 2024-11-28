package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.controllers;

import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Entities.Prato;
import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Services.PratoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/prato")
public class PratoController {
    private PratoService pratoService;

    public PratoController(PratoService pratoService){
        this.pratoService = pratoService;
    }


    @PostMapping(value="adicionarPrato")
    public ResponseEntity<Prato> AdicionarPrato(@RequestBody Prato prato){
        Prato tempMedidor = pratoService.adicionar(prato);
        return ResponseEntity.ok(tempMedidor);
    }
}
