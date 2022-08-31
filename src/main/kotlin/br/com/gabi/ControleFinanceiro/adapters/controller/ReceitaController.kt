package br.com.gabi.ControleFinanceiro.adapters.controller

import br.com.gabi.ControleFinanceiro.dto.NovaReceitaDto
import br.com.gabi.ControleFinanceiro.usecase.service.CadastraService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/receitas")
class ReceitaController(
    private val service: CadastraService) {

    @PostMapping
    fun cadastrarReceita(
        @RequestBody receita: NovaReceitaDto
    ) {
     service.cadastrarReceita(receita)
    }

    @GetMapping
    fun listaReceitas(): List<NovaReceitaDto>{
        return service.listarReceita()
    }
}