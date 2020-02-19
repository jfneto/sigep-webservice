package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType


@XmlType(name = "statusPlp")
@XmlEnum
enum class StatusPlp(private val value: String) {
    ABERTA("Aberta"), FECHADA("Fechada"), POSTADA("Postada");

    fun value(): String {
        return value
    }

    companion object {
        fun fromValue(v: String): StatusPlp {
            for (c in values()) {
                if (c.value == v) {
                    return c
                }
            }
            throw IllegalArgumentException(v)
        }
    }

}