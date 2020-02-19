package br.com.correios.webservice.enums

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for acao.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 *
 * <pre>
 * &lt;simpleType name="acao">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="DEVOLVIDO_AO_REMETENTE"/>
 * &lt;enumeration value="ENCAMINHADO_PARA_REFUGO"/>
 * &lt;enumeration value="REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE"/>
 * &lt;enumeration value="DESBLOQUEADO"/>
 * &lt;/restriction>
 * &lt;/simpleType>
</pre> *
 *
 */
@XmlType(name = "acao", namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
@XmlEnum
enum class Acao {
    DEVOLVIDO_AO_REMETENTE, ENCAMINHADO_PARA_REFUGO, REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE, DESBLOQUEADO;

    fun value(): String {
        return name
    }

    companion object {
        fun fromValue(v: String?): Acao {
            return valueOf(v!!)
        }
    }
}