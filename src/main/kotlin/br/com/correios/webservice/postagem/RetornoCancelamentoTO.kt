package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoCancelamentoTO", propOrder = ["codErro", "codigoAdministrativo", "data", "hora", "msgErro", "objetoPostal"])
class RetornoCancelamentoTO {
    @XmlElement(name = "cod_erro")
    var codErro: String? = null
    @XmlElement(name = "codigo_administrativo")
    var codigoAdministrativo: String? = null
    var data: String? = null
    var hora: String? = null
    @XmlElement(name = "msg_erro")
    var msgErro: String? = null
    @XmlElement(name = "objeto_postal")
    var objetoPostal: ObjetoSimplificadoTO? = null
}