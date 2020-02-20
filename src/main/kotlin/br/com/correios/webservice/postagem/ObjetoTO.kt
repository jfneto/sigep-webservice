package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoTO", propOrder = ["desc", "entrega", "id", "item", "num"])
class ObjetoTO {
    var desc: String? = null
    var entrega: String? = null
    var id: String? = null
    var item: String? = null
    var num: String? = null
}