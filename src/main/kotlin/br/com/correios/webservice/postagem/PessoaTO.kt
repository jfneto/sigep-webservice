package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlSeeAlso
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pessoaTO", propOrder = ["bairro", "cep", "cidade", "complemento", "ddd", "email", "logradouro", "nome", "numero", "referencia", "telefone", "uf"])
@XmlSeeAlso(RemetenteTO::class)
open class PessoaTO {
    var bairro: String? = null
    var cep: String? = null
    var cidade: String? = null
    var complemento: String? = null
    var ddd: String? = null
    var email: String? = null
    var logradouro: String? = null
    var nome: String? = null
    var numero: String? = null
    var referencia: String? = null
    var telefone: String? = null
    var uf: String? = null
}