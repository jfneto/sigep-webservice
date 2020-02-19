package br.com.correios.webservice.rastreio

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "listaEntregaExterna", name = "ListaEntregaExterna", propOrder = ["loec"])
class ListaEntregaExterna {

    var loec: String? = null

}