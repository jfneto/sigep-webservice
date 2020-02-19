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
 * &lt;element name="CalcDataMaximaResult" type="{http://tempuri.org/}cResultadoObjeto"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = ["calcDataMaximaResult"])
@XmlRootElement(name = "CalcDataMaximaResponse", namespace = "http://tempuri.org/")
class CalcDataMaximaResponse {
    @XmlElement(
        name = "CalcDataMaximaResult",
        namespace = "http://tempuri.org/",
        required = true
    )
    var calcDataMaximaResult: CResultadoObjeto? = null
}