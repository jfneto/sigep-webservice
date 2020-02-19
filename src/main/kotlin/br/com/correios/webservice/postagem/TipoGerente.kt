package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

@XmlType(name = "tipoGerente")
@XmlEnum
enum class TipoGerente(private val value: String) {
    GERENTE_CONTA("GerenteConta"), GERENTE_CONTA_MASTER("GerenteContaMaster");

    fun value(): String {
        return value
    }

    companion object {
        fun fromValue(v: String): TipoGerente {
            for (c in values()) {
                if (c.value == v) {
                    return c
                }
            }
            throw IllegalArgumentException(v)
        }
    }

}