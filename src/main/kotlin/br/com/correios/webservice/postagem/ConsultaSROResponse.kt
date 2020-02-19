package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaSROResponse", propOrder = ["return"])
class ConsultaSROResponse {

    @XmlElement(name = "return")
    var `return`: String? = null

}