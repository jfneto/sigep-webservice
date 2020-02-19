package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for remetente complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="remetente">
 * &lt;complexContent>
 * &lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}pessoa">
 * &lt;sequence>
 * &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="ddd_celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="identificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="sms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "remetente",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["celular", "dddCelular", "identificacao", "sms"]
)
class Remetente : Pessoa() {

    var celular: String? = null
    @XmlElement(name = "ddd_celular")
    var dddCelular: String? = null
    var identificacao: String? = null
    var sms: String? = null

}