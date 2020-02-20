package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assuntoPIMaster", propOrder = ["codigo", "descricao", "tipo"])
class AssuntoPIMaster {
    var codigo: Int? = null
    var descricao: String? = null
    var tipo: String? = null
}