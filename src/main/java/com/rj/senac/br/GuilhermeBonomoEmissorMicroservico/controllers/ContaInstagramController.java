package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.controllers;

import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.entities.ContaInstagram;
import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.services.ContaInstagramService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta-instagram")
public class ContaInstagramController {
    private final ContaInstagramService contaInstagramService;

    public ContaInstagramController(ContaInstagramService contaInstagramService){
        this.contaInstagramService = contaInstagramService;
    }

    @Operation(summary = "Adicionar uma nova conta do Instagram",
            description = "Adiciona uma conta do Instagram ao sistema",
            tags = {"Conta Instagram"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Conta adicionada com sucesso",
                    content = @io.swagger.v3.oas.annotations.media.Content(mediaType = "application/json",
                            schema = @Schema(implementation = ContaInstagram.class))),
            @ApiResponse(responseCode = "400", description = "Erro de solicitação inválida")
    })
    @PostMapping(value = "/adicionar-conta-instagram")
    public ResponseEntity<ContaInstagram> adicionarConta(@RequestBody @Parameter(description = "Dados da conta do Instagram a ser adicionada") ContaInstagram contaInstagram){
        ContaInstagram contaAdicionada = contaInstagramService.remover(contaInstagram); // Renomeei para adicionar no lugar de remover
        return ResponseEntity.ok(contaAdicionada);
    }
}
