package br.com.gabi.ControleFinanceiro.adpters.controller

import br.com.gabi.ControleFinanceiro.dto.novaReceitaDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/receitas")
class ReceitaController {

    @PostMapping
    fun cadastrarReceita(
        @RequestBody receita: novaReceitaDto
    ) {

    }
}