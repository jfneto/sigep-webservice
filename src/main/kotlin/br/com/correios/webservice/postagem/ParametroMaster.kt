package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for parametroMaster complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="parametroMaster">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="prmCoParametro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="prmTxParametro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="prmTxValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "parametroMaster",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["prmCoParametro", "prmTxParametro", "prmTxValor"]
)
class ParametroMaster {
    var prmCoParametro: Long = 0
    var prmTxParametro: String? = null
    var prmTxValor: String? = null
}