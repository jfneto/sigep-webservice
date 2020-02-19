package br.com.correios.webservice.estimativa

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for ArrayOfCServicosCalculo complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfCServicosCalculo">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="cServicosCalculo" type="{http://tempuri.org/}cServicosCalculo" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCServicosCalculo", namespace = "http://tempuri.org/", propOrder = ["cServicosCalculo"])
class ArrayOfCServicosCalculo {
    @XmlElement(namespace = "http://tempuri.org/")
    var cServicosCalculo: List<CServicosCalculo>? = ArrayList()
}