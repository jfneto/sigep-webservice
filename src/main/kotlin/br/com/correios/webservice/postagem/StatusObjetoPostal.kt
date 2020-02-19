package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType


@XmlType(name = "statusObjetoPostal")
@XmlEnum
enum class StatusObjetoPostal(private val value: String) {
    EM_BRANCO("EmBranco"), POSTADO("Postado"), CANCELADO("Cancelado"), ESTORNO("Estorno");

    fun value(): String {
        return value
    }

    companion object {
        fun fromValue(v: String): StatusObjetoPostal {
            for (c in values()) {
                if (c.value == v) {
                    return c
                }
            }
            throw IllegalArgumentException(v)
        }
    }

}