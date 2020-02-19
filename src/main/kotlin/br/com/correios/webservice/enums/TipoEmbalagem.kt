package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for tipoEmbalagem.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="tipoEmbalagem">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="DE"/>
 * &lt;enumeration value="PD"/>
 * &lt;enumeration value="RL"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(
    name = "tipoEmbalagem",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/"
)
@XmlEnum
enum class TipoEmbalagem {
    DE, PD, RL;

    fun value(): String {
        return name
    }

    companion object {
        fun fromValue(v: String?): TipoEmbalagem {
            return valueOf(v!!)
        }
    }
}