package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for tipoBloqueio.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="tipoBloqueio">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="FRAUDE_BLOQUEIO"/>
 * &lt;enumeration value="EXTRAVIO_VAREJO_PRE_INDENIZADO"/>
 * &lt;enumeration value="EXTRAVIO_VAREJO_POS_INDENIZADO"/>
 * &lt;enumeration value="EXTRAVIO_CORPORATIVO"/>
 * &lt;enumeration value="INTERNACIONAL_LDI"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(
    name = "tipoBloqueio",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/"
)
@XmlEnum
enum class TipoBloqueio {
    FRAUDE_BLOQUEIO, EXTRAVIO_VAREJO_PRE_INDENIZADO, EXTRAVIO_VAREJO_POS_INDENIZADO, EXTRAVIO_CORPORATIVO, INTERNACIONAL_LDI;

    fun value(): String {
        return name
    }

    companion object {
        fun fromValue(v: String?): TipoBloqueio {
            return valueOf(v!!)
        }
    }
}