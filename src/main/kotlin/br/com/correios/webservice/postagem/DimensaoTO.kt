package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for dimensaoTO complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="dimensaoTO">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="altura" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 * &lt;element name="comprimento" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 * &lt;element name="diametro" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 * &lt;element name="largura" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 * &lt;element name="peso" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 * &lt;element name="soma" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
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
    name = "dimensaoTO",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["altura", "comprimento", "diametro", "largura", "peso", "soma"]
)
class DimensaoTO {

    var altura: MedidaTO? = null

    var comprimento: MedidaTO? = null

    var diametro: MedidaTO? = null

    var largura: MedidaTO? = null

    var peso: MedidaTO? = null

    var soma: MedidaTO? = null

}