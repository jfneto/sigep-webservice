package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for getStatusPLP complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getStatusPLP">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="arg0" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoPostal" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "getStatusPLP",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["arg0", "arg1"]
)
class GetStatusPLP {
    var arg0: List<ObjetoPostal>? = ArrayList()
    var arg1: String? = null
}