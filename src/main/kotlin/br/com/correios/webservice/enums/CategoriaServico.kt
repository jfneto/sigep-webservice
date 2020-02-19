package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for categoriaServico.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="categoriaServico">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="SEM_CATEGORIA"/>
 * &lt;enumeration value="PAC"/>
 * &lt;enumeration value="SEDEX"/>
 * &lt;enumeration value="CARTA"/>
 * &lt;enumeration value="GRANDES_FORMATOS"/>
 * &lt;enumeration value="REVERSO"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(
    name = "categoriaServico",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/"
)
@XmlEnum
enum class CategoriaServico {
    SEM_CATEGORIA, PAC, SEDEX, CARTA, GRANDES_FORMATOS, REVERSO;

    fun value(): String {
        return name
    }

    companion object {
        fun fromValue(v: String?): CategoriaServico {
            return valueOf(v!!)
        }
    }
}