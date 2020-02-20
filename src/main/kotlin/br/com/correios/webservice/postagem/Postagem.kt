package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postagem", propOrder = ["agencia", "avisoRecebimento", "data", "local", "valorDeclarado"])
class Postagem {
    var agencia: String? = null
    var avisoRecebimento: String? = null
    var data: String? = null
    var local: String? = null
    var valorDeclarado: String? = null
}