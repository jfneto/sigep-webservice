package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarPedidosInformacaoResponse", propOrder = ["return"])
class RegistrarPedidosInformacaoResponse {
    @XmlElement(name = "return")
    protected var _return: List<Retorno>? = null

    val `return`: List<Retorno>?
        get() {
            if (_return == null) {
                _return = ArrayList()
            }
            return _return
        }
}