package br.com.correios.webservice.estimativa

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for cServicosCalculo complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cServicosCalculo">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="calcula_preco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="calcula_prazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="msgErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "cServicosCalculo",
    namespace = "http://tempuri.org/",
    propOrder = ["codigo", "descricao", "calculaPreco", "calculaPrazo", "erro", "msgErro"]
)
class CServicosCalculo {

    @XmlElement(namespace = "http://tempuri.org/")
    var codigo: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var descricao: String? = null

    @XmlElement(name = "calcula_preco", namespace = "http://tempuri.org/")
    var calculaPreco: String? = null

    @XmlElement(name = "calcula_prazo", namespace = "http://tempuri.org/")
    var calculaPrazo: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var erro: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var msgErro: String? = null

}