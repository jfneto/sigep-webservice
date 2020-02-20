package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarPedidosInformacaoResponse", propOrder = ["retorno"])
class ConsultarPedidosInformacaoResponse {
    @XmlElement(name = "return")
    var retorno: List<Retorno>? = ArrayList()
}