package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conta", propOrder = ["codigoBanco", "nomeBanco", "numeroAgencia", "numeroConta"])
class Conta {
    var codigoBanco: String? = null
    var nomeBanco: String? = null
    var numeroAgencia: String? = null
    var numeroConta: String? = null
}