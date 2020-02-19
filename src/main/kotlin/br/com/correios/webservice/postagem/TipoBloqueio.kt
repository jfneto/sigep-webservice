package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

@XmlType(name = "tipoBloqueio")
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