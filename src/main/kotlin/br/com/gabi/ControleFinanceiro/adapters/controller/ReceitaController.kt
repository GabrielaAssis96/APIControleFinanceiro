package br.com.gabi.ControleFinanceiro.adapters.controller

import br.com.gabi.ControleFinanceiro.dto.NovaReceitaDto
import br.com.gabi.ControleFinanceiro.usecase.service.CadastraService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/receitas")
class ReceitaController(
    private val cadastraService: CadastraService) {

    @PostMapping
    fun cadastrarReceita(
        @RequestBody receita: NovaReceitaDto
    ) {
     cadastraService.cadastrarReceita(receita)
    }
}