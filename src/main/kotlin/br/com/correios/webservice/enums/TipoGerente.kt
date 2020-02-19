package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for tipoGerente.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="tipoGerente">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="GerenteConta"/>
 * &lt;enumeration value="GerenteContaMaster"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(
    name = "tipoGerente",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/"
)
@XmlEnum
enum class TipoGerente(private val value: String) {
    GERENTE_CONTA("GerenteConta"), GERENTE_CONTA_MASTER("GerenteContaMaster");

    fun value(): String {
        return value
    }

    companion object {
        fun fromValue(v: String): TipoGerente {
            for (c in values()) {
                if (c.value == v) {
                    return c
                }
            }
            throw IllegalArgumentException(v)
        }
    }

}