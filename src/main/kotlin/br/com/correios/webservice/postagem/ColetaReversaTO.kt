package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaReversaTO", propOrder = ["ag", "ar", "cartao", "numero", "objCol", "servicoAdicional"])
class ColetaReversaTO : ColetaTO() {

    var ag: String? = null

    var ar: Int? = null

    var cartao: Long? = null

    var numero: Int? = null

    @XmlElement(name = "obj_col", nillable = true)
    var objCol: List<ObjetoTO>? = ArrayList()

    @XmlElement(name = "servico_adicional")
    var servicoAdicional: String? = null
}