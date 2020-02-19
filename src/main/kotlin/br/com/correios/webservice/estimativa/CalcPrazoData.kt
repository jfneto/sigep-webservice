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
 * &lt;element name="nCdServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="sCepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="sCepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="sDtCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = ["nCdServico", "sCepOrigem", "sCepDestino", "sDtCalculo"])
@XmlRootElement(name = "CalcPrazoData", namespace = "http://tempuri.org/")
class CalcPrazoData {

    @XmlElement(namespace = "http://tempuri.org/")
    var nCdServico: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var sCepOrigem: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var sCepDestino: String? = null

    @XmlElement(namespace = "http://tempuri.org/")
    var sDtCalculo: String? = null

}