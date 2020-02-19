package br.com.correios.webservice.rastreio

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registroUnidades", propOrder = ["codigoDR", "codigoMCU", "codigoSRO", "nomeUnidade", "siglaDR", "siglaTipoUnidade", "tipoUnidade"])
class RegistroUnidades {

    var codigoDR: String? = null

    var codigoMCU: String? = null

    var codigoSRO: String? = null

    var nomeUnidade: String? = null

    var siglaDR: String? = null

    var siglaTipoUnidade: String? = null

    var tipoUnidade: String? = null

}