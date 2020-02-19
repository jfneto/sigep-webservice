package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for statusUsuario.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="statusUsuario">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="Ativo"/>
 * &lt;enumeration value="Inativo"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(
    name = "statusUsuario",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/"
)
@XmlEnum
enum class StatusUsuario(private val value: String) {
    ATIVO("Ativo"), INATIVO("Inativo");

    fun value(): String {
        return value
    }

    companion object {
        fun fromValue(v: String): StatusUsuario {
            for (c in values()) {
                if (c.value == v) {
                    return c
                }
            }
            throw IllegalArgumentException(v)
        }
    }

}