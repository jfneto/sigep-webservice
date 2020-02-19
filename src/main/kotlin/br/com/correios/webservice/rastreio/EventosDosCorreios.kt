package br.com.correios.webservice.rastreio

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sroxml", propOrder = ["versao", "qtd", "tipoPesquisa", "tipoResultado", "objeto"])
open class EventosDosCorreios(
    var versao: String? = null,
    var qtd: String? = null,
    @XmlElement(name = "TipoPesquisa")
    var tipoPesquisa: String? = null,
    @XmlElement(name = "TipoResultado")
    var tipoResultado: String? = null,
    @XmlElement
    var objeto: MutableList<Objeto>? = ArrayList()
)