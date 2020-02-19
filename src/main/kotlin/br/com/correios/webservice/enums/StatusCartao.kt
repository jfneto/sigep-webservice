package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for statusCartao.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="statusCartao">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="Desconhecido"/>
 * &lt;enumeration value="Normal"/>
 * &lt;enumeration value="Suspenso"/>
 * &lt;enumeration value="Cancelado"/>
 * &lt;enumeration value="Irregular"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(
    name = "statusCartao",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/"
)
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