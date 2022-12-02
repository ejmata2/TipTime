package com.example.tiptime

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalculadoraPropinasTest {
    @Test
    fun calcular_20_porciento() {
        val cantidad = 10.00
        val porcentaje =20.00
        val propinaEsperada = "2,00 €"
        val propina = calcularPropina(cantidad, porcentaje, false)

        assertEquals(propinaEsperada, propina)
    }
}