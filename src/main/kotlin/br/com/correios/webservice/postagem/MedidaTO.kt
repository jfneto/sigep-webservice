package br.com.correios.webservice.postagem

import java.math.BigDecimal
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for medidaTO complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="medidaTO">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="maximo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 * &lt;element name="minimo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    name = "medidaTO",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["maximo", "minimo"]
)
class MedidaTO {

    var maximo: BigDecimal? = null
    var minimo: BigDecimal? = null

}