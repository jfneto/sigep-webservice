package br.com.correios.webservice.rastreio

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "listaEntregaExternaResponse", name = "ListaEntregaExternaResponse", propOrder = ["retorno"])
class ListaEntregaExternaResponse {
    @XmlElement(name = "return")
    var retorno: ListaEntregaExterna2? = null
}