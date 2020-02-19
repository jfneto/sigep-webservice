package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

@XmlType(name = "statusCartao")
@XmlEnum
enum class StatusCartao(private val value: String) {
    DESCONHECIDO("Desconhecido"), NORMAL("Normal"), SUSPENSO("Suspenso"), CANCELADO("Cancelado"), IRREGULAR("Irregular");

    fun value(): String {
        return value
    }

    companion object {
        fun fromValue(v: String): StatusCartao {
            for (c in values()) {
                if (c.value == v) {
                    return c
                }
            }
            throw IllegalArgumentException(v)
        }
    }

}