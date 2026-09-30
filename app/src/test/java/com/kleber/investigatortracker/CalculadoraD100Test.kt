package com.kleber.investigatortracker

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculadoraD100Test {

    // Instanciamos a nossa calculadora uma única vez para todos os testes
    private val calculadora = CalculadoraD100()

    @Test
    fun deveRetornarSucessoNormal_QuandoDadoMenorOuIgualAPericia() {
        val resultado = calculadora.avaliarRolagem(60,50)
        assertEquals("Sucesso Normal", resultado)
    }

    @Test
    fun deveRetornarSucessoSolído_QuandoDadoMenorOuIgualAMetade(){
        val resultado = calculadora.avaliarRolagem(60,30)
        assertEquals("Sucesso Solído", resultado)
    }
    @Test
    fun deveRetornarSucessoExtremo_QuandoDadoMenorOuIgualAQuintaParte() {
        val resultado = calculadora.avaliarRolagem(60, 12)
        assertEquals("Sucesso Extremo", resultado)
    }

    @Test
    fun deveRetornarAcertoCritico_QuandoDadoForUm() {
        val resultado = calculadora.avaliarRolagem(45, 1)
        assertEquals("Acerto Crítico", resultado)
    }

    @Test
    fun deveRetornarDesastre_QuandoPericiaAltaEDadoCem() {
        val resultado = calculadora.avaliarRolagem(60, 100)
        assertEquals("Desastre", resultado)
    }

    @Test
    fun deveRetornarDesastre_QuandoPericiaBaixaEDadoAcimaDeNoventaECinco() {
        val resultado = calculadora.avaliarRolagem(40, 96)
        assertEquals("Desastre", resultado)
    }

    @Test
    fun deveRetornarFalha_QuandoDadoMaiorQuePericia() {
        val resultado = calculadora.avaliarRolagem(60, 65)
        assertEquals("Falha", resultado)
    }
}
