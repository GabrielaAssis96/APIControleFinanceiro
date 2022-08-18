package br.com.gabi.ControleFinanceiro.dto

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.validation.constraints.NotEmpty

data class NovaReceitaDto(
    @NotEmpty val descricao: String,
    @NotEmpty val valor: BigDecimal,
    @NotEmpty val data: LocalDateTime = LocalDateTime.now()
)