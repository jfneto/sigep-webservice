package br.com.correios.webservice.rastreio

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for buscaEventosListaResponse complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="buscaEventosListaResponse">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="return" type="{http://resource.webservice.correios.com.br/}sroxml" minOccurs="0"/>
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
    name = "buscaEventosListaResponse",
    namespace = "http://resource.webservice.correios.com.br/",
    propOrder = ["retorno"]
)
class BuscaEventosListaResponse {
    @XmlElement(name = "return")
    var retorno: EventosDosCorreios? = null
}