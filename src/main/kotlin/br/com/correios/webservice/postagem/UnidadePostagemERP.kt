package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for unidadePostagemERP complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="unidadePostagemERP">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="diretoriaRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="endereco" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}enderecoERP" minOccurs="0"/>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "unidadePostagemERP",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["diretoriaRegional", "endereco", "id", "nome", "status", "tipo"]
)
class UnidadePostagemERP {

    var diretoriaRegional: String? = null

    var endereco: EnderecoERP? = null

    var id: String? = null

    var nome: String? = null

    var status: String? = null

    var tipo: String? = null

}