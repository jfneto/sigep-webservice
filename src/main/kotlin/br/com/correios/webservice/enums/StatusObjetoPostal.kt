package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for statusObjetoPostal.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="statusObjetoPostal">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="EmBranco"/>
 * &lt;enumeration value="Postado"/>
 * &lt;enumeration value="Cancelado"/>
 * &lt;enumeration value="Estorno"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(
    name = "statusObjetoPostal",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/"
)
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