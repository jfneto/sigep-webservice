package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtoTO", propOrder = ["codigo", "qtd", "tipo"])
class ProdutoTO {

    var codigo: Long? = null

    var qtd: Long? = null

    var tipo: Long? = null

}