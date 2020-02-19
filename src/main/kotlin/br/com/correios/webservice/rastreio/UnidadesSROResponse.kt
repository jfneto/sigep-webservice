package br.com.correios.webservice.rastreio

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "UnidadesSROResponse", name = "UnidadesSROResponse", propOrder = ["_return"])
open class UnidadesSROResponse {
    @XmlElement(name = "return")
    protected var _return: List<RegistroUnidades>? = null

    val `return`: List<RegistroUnidades>?
        get() {
            if (_return == null) {
                _return = ArrayList()
            }
            return _return
        }
}