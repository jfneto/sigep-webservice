package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for tipoMensagem.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="tipoMensagem">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="A"/>
 * &lt;enumeration value="E"/>
 * &lt;enumeration value="S"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(
    name = "tipoMensagem",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/"
)
@XmlEnum
enum class TipoMensagem {
    A, E, S;

    fun value(): String {
        return name
    }

    companion object {
        fun fromValue(v: String?): TipoMensagem {
            return valueOf(v!!)
        }
    }
}