package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retorno", propOrder = ["codigoPI", "codigoRegistro", "codigoRetorno", "dataPrazoResposta", "dataRegistro", "dataResposta", "dataUltimaRecorrencia", "id", "mensagemRetorno", "resposta"])
class Retorno {

    var codigoPI: Long? = null

    var codigoRegistro: String? = null

    var codigoRetorno: String? = null

    var dataPrazoResposta: String? = null

    var dataRegistro: String? = null

    var dataResposta: String? = null

    var dataUltimaRecorrencia: String? = null

    var id: Long? = null

    var mensagemRetorno: String? = null

    var resposta: String? = null

}