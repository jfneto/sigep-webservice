package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.*

/**
 *
 * Java class for coleta complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="coleta">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="cklist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="produto" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}produto" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="remetente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}remetente" minOccurs="0"/>
 * &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="valor_declarado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "coleta",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["cklist", "descricao", "documento", "idCliente", "produto", "remetente", "tipo", "valorDeclarado"]
)
@XmlSeeAlso(
    ColetaSimultanea::class, ColetaReversa::class
)
open class Coleta {

    var cklist: String? = null

    var descricao: String? = null

    @XmlElement(nillable = true)
    var documento: List<String>? = ArrayList()

    @XmlElement(name = "id_cliente")
    var idCliente: String? = null

    @XmlElement(nillable = true)
    var produto: List<Produto>? = ArrayList()

    var remetente: Remetente? = null

    var tipo: String? = null

    @XmlElement(name = "valor_declarado")
    var valorDeclarado: String? = null

}