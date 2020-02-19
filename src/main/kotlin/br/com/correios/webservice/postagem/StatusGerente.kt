package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType


@XmlType(name = "statusGerente")
@XmlEnum
enum class StatusGerente(private val value: String) {
    ATIVO("Ativo"), INATIVO("Inativo");

    fun value(): String {
        return value
    }

    companion object {
        fun fromValue(v: String): StatusGerente {
            for (c in values()) {
                if (c.value == v) {
                    return c
                }
            }
            throw IllegalArgumentException(v)
        }
    }

}