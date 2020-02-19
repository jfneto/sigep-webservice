package br.com.correios.webservice.rastreio

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "unidadesSRO", name = "UnidadesSRO", propOrder = ["codigoSRO"])
class UnidadesSRO {

    var codigoSRO: String? = null

}