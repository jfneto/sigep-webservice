package br.com.correios.webservice.rastreio

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rastroJsonResponse", name = "RastroJsonResponse", propOrder = ["retorno"])
class RastroJsonResponse {

    @XmlElement(name = "return")
    var retorno: String? = null

}