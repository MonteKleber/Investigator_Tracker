package com.kleber.investigatortracker

class CalculadoraD100 {

    fun avaliarRolagem(pericia: Int, dado: Int): String{
        return when{
            dado == 1 -> "Acerto Crítico"

            // Regras de Desastre dinânmicas
            pericia >= 50 && dado == 100 -> "Desastre"
            pericia < 50 && dado >= 96 -> "Desastre"

            // Cálculos de sucesso
            dado <= (pericia / 5) -> "Sucesso Extremo"
            dado <= (pericia / 2) -> "Sucesso Solído"
            dado <= pericia -> "Sucesso Normal"

            else -> "Falha"
        }
    }
}