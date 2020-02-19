package br.com.correios.webservice.estimativa

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for cResultadoServicos complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cResultadoServicos">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="ServicosCalculo" type="{http://tempuri.org/}ArrayOfCServicosCalculo" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cResultadoServicos", namespace = "http://tempuri.org/", propOrder = ["servicosCalculo"])
class CResultadoServicos {

    @XmlElement(name = "ServicosCalculo", namespace = "http://tempuri.org/")
    var servicosCalculo: ArrayOfCServicosCalculo? = null

}