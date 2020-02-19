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
 * &lt;element name="CalcPrecoPrazoResult" type="{http://tempuri.org/}cResultado"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = ["calcPrecoPrazoResult"])
@XmlRootElement(name = "CalcPrecoPrazoResponse", namespace = "http://tempuri.org/")
class CalcPrecoPrazoResponse {

    @XmlElement(
        name = "CalcPrecoPrazoResult",
        namespace = "http://tempuri.org/",
        required = true
    )
    var calcPrecoPrazoResult: CResultado? = null

}