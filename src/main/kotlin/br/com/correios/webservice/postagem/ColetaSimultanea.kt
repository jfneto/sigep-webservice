package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for coletaSimultanea complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="coletaSimultanea">
 * &lt;complexContent>
 * &lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}coleta">
 * &lt;sequence>
 * &lt;element name="obj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "coletaSimultanea",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["obj", "obs"]
)
class ColetaSimultanea : Coleta() {

    var obj: String? = null

    var obs: String? = null

}