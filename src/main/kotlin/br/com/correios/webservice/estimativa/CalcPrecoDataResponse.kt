package br.com.correios.webservice.estimativa

import javax.xml.bind.annotation.*

/**
 *
 * Java class for anonymous complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="CalcPrecoDataResult" type="{http://tempuri.org/}cResultado"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = ["calcPrecoDataResult"])
@XmlRootElement(name = "CalcPrecoDataResponse", namespace = "http://tempuri.org/")
class CalcPrecoDataResponse {

    @XmlElement(
        name = "CalcPrecoDataResult",
        namespace = "http://tempuri.org/",
        required = true
    )
    var calcPrecoDataResult: CResultado? = null

}