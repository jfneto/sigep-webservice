package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for simNao.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="simNao">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="S"/>
 * &lt;enumeration value="N"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(name = "simNao", namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
@XmlEnum
enum class SimNao {
    S, N;

    fun value(): String {
        return name
    }

    companion object {
        fun fromValue(v: String?): SimNao {
            return valueOf(v!!)
        }
    }
}