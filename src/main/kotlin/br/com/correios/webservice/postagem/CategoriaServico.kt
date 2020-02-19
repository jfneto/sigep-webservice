package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlType

@XmlType(name = "categoriaServico")
@XmlEnum
enum class CategoriaServico {
    SEM_CATEGORIA, PAC, SEDEX, CARTA_REGISTRADA, SERVICO_COM_RESTRICAO, REVERSO;

    fun value(): String {
        return name
    }

    companion object {
        fun fromValue(v: String?): CategoriaServico {
            return valueOf(v!!)
        }
    }
}