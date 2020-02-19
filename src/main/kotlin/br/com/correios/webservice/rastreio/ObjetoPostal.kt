package br.com.correios.webservice.rastreio

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoPostal", propOrder = ["agrupamento", "avisoRecebimento", "devolucaoDocumento", "devolucaoObjeto", "maoPropria", "numeroObjeto"])
class ObjetoPostal {

    var agrupamento: String? = null

    var avisoRecebimento: String? = null

    var devolucaoDocumento: String? = null

    var devolucaoObjeto: String? = null

    var maoPropria: String? = null

    var numeroObjeto: String? = null

}