package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for statusPlp.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="statusPlp">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="Aberta"/>
 * &lt;enumeration value="Fechada"/>
 * &lt;enumeration value="Postada"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(
    name = "statusPlp",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/"
)
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