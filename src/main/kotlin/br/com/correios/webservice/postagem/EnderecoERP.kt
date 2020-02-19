package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for enderecoERP complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="enderecoERP">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="complemento2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="unidadesPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}unidadePostagemERP" maxOccurs="unbounded" minOccurs="0"/>
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
    name = "enderecoERP",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["bairro", "cep", "cidade", "complemento2", "end", "uf", "unidadesPostagem"]
)
class EnderecoERP {

    var bairro: String? = null

    var cep: String? = null

    var cidade: String? = null

    var complemento2: String? = null

    var end: String? = null

    var uf: String? = null

    @XmlElement(nillable = true)
    var unidadesPostagem: List<UnidadePostagemERP>? = ArrayList()

}