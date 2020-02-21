package br.com.correios.webservice.postagem

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * @author lima.joao
 * @since 21/02/2020 11:58
 */
internal class AtendeClienteServiceTest{

    @Test
    fun teste(){
        val atende = AtendeClienteService()

        assertNotNull(atende)
    }

}