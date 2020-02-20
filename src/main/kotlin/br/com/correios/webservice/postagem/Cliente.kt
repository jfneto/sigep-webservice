package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = ["numeroContrato", "possuiContrato"])
class Cliente {
    var numeroContrato: String? = null
    var possuiContrato: String? = null
}