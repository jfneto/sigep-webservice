package br.com.correios.webservice.rastreio

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for sroxml complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="sroxml">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="versao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="qtd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="TipoPesquisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="TipoResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element ref="{http://resource.webservice.correios.com.br/}objeto" maxOccurs="unbounded" minOccurs="0"/>
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
    name = "sroxml",
    namespace = "http://resource.webservice.correios.com.br/",
    propOrder = ["versao", "qtd", "tipoPesquisa", "tipoResultado", "objeto"]
)
class Sroxml {
    var versao: String? = null
    var qtd: String? = null

    @XmlElement(name = "TipoPesquisa")
    var tipoPesquisa: String? = null

    @XmlElement(name = "TipoResultado")
    var tipoResultado: String? = null

    @XmlElement(namespace = "http://resource.webservice.correios.com.br/")
    var objeto: List<Objeto>? = ArrayList()
}