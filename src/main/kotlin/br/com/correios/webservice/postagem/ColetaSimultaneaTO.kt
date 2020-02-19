package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaSimultaneaTO", propOrder = ["obj", "obs"])
class ColetaSimultaneaTO : ColetaTO() {

    var obj: String? = null

    var obs: String? = null

}