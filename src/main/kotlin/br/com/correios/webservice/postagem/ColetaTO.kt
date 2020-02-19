package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaTO", propOrder = ["cklist", "descricao", "idCliente", "produto", "remetente", "tipo", "valorDeclarado"])
@XmlSeeAlso(ColetaReversaTO::class, ColetaSimultaneaTO::class)
open class ColetaTO {

    var cklist: String? = null

    var descricao: String? = null


    @XmlElement(name = "id_cliente")
    var idCliente: String? = null

    @XmlElement(nillable = true)
    var produto: List<ProdutoTO>? = ArrayList()

    var remetente: RemetenteTO? = null

    var tipo: String? = null

    @XmlElement(name = "valor_declarado")
    var valorDeclarado: String? = null

}