package br.com.gabi.ControleFinanceiro.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class novaReceitaDto(
    var descricao: String,
    var valor: BigDecimal,
    var data: LocalDateTime = LocalDateTime.now()
)