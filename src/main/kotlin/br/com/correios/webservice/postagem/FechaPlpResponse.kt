package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for fechaPlpResponse complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="fechaPlpResponse">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    name = "fechaPlpResponse",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["_return"]
)
class FechaPlpResponse {

    @XmlElement(name = "return")
    var `return`: Long? = null

}