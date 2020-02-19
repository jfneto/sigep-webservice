package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaSRO", propOrder = ["listaObjetos", "tipoConsulta", "tipoResultado", "usuarioSro", "senhaSro"])
class ConsultaSRO {
    protected var listaObjetos: List<String>? = ArrayList()

    var tipoConsulta: String? = null

    var tipoResultado: String? = null

    var usuarioSro: String? = null

    var senhaSro: String? = null

}