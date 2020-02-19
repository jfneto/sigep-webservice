package br.com.correios.webservice.rastreio

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "UnidadesSROResponse", name = "UnidadesSROResponse", propOrder = ["retorno"])
open class UnidadesSROResponse {
    @XmlElement(name = "return")
    var retorno: List<RegistroUnidades>? = ArrayList()
}