package br.com.gabi.ControleFinanceiro.usecase.service

import br.com.gabi.ControleFinanceiro.dto.NovaReceitaDto
import org.springframework.stereotype.Service

@Service
class CadastraService(private var receitas: List<NovaReceitaDto> = ArrayList()) {

    fun cadastrarReceita(novaReceitaDto: NovaReceitaDto) {
        receitas.plus(novaReceitaDto)
    }


}