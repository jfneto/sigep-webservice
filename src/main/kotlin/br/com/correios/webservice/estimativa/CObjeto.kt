package br.com.correios.webservice.estimativa

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for cObjeto complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cObjeto">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="prazoEntrega" type="{http://www.w3.org/2001/XMLSchema}int"/>
 * &lt;element name="dataPostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="dataPostagemCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="dataMaxEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="postagemDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="dataUltimoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="codigoUltimoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="tipoUltimoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="descricaoUltimoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="msgErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="nuTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "cObjeto",
    namespace = "http://tempuri.org/",
    propOrder = ["codigo", "servico", "cepOrigem", "cepDestino", "prazoEntrega", "dataPostagem", "dataPostagemCalculo", "dataMaxEntrega", "postagemDH", "dataUltimoEvento", "codigoUltimoEvento", "tipoUltimoEvento", "descricaoUltimoEvento", "erro", "msgErro", "nuTicket"]
)
class CObjeto {

    @XmlElement(namespace = "http://tempuri.org/")
    var codigo: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var servico: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var cepOrigem: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var cepDestino: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var prazoEntrega = 0

    @XmlElement(namespace = "http://tempuri.org/")
    var dataPostagem: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var dataPostagemCalculo: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var dataMaxEntrega: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var postagemDH: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var dataUltimoEvento: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var codigoUltimoEvento: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var tipoUltimoEvento: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var descricaoUltimoEvento: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var erro: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var msgErro: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var nuTicket: String? = null

}