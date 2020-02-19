package br.com.correios.webservice.rastreio

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rastroJson", name = "RastroJson", propOrder = ["usuario", "senha", "tipo", "resultado", "lingua", "objetos"])
class RastroJson {

    var usuario: String? = null

    var senha: String? = null

    var tipo: String? = null

    var resultado: String? = null

    var lingua: String? = null

    var objetos: String? = null

}