package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for coletaReversa complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="coletaReversa">
 * &lt;complexContent>
 * &lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}coleta">
 * &lt;sequence>
 * &lt;element name="ag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="ar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="cartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="obj_col" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objeto" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="servico_adicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "coletaReversa",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["ag", "ar", "cartao", "numero", "objCol", "servicoAdicional"]
)
class ColetaReversa : Coleta() {

    var ag: String? = null

    var ar: Int? = null

    var cartao: String? = null

    var numero: Int? = null

    @XmlElement(name = "obj_col", nillable = true)
    var objCol: List<Objeto>? = ArrayList()

    @XmlElement(name = "servico_adicional")
    var servicoAdicional: String? = null

}