package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.SimNao
import br.com.correios.webservice.enums.StatusPlp
import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for preListaPostagem complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="preListaPostagem">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="cartaoPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}cartaoPostagemERP" minOccurs="0"/>
 * &lt;element name="conteudoProibido" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}simNao" minOccurs="0"/>
 * &lt;element name="dataAtualizacaoCliente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataAtualizacaoSara" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataFechamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataPostagem" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataPostagemSara" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="objetosPostais" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoPostal" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="plpCliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="plpNu" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="plpXml" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="plpXmlRetorno" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="status" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusPlp" minOccurs="0"/>
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
    name = "preListaPostagem",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["cartaoPostagem", "conteudoProibido", "dataAtualizacaoCliente", "dataAtualizacaoSara", "dataFechamento", "dataPostagem", "dataPostagemSara", "objetosPostais", "plpCliente", "plpNu", "plpXml", "plpXmlRetorno", "status"]
)
class PreListaPostagem {
    var cartaoPostagem: CartaoPostagemERP? = null
    @XmlSchemaType(name = "string")
    var conteudoProibido: SimNao? = null
    @XmlSchemaType(name = "dateTime")
    var dataAtualizacaoCliente: XMLGregorianCalendar? = null
    @XmlSchemaType(name = "dateTime")
    var dataAtualizacaoSara: XMLGregorianCalendar? = null
    @XmlSchemaType(name = "dateTime")
    var dataFechamento: XMLGregorianCalendar? = null
    @XmlSchemaType(name = "dateTime")
    var dataPostagem: XMLGregorianCalendar? = null
    @XmlSchemaType(name = "dateTime")
    var dataPostagemSara: XMLGregorianCalendar? = null
    @XmlElement(nillable = true)
    var objetosPostais: List<ObjetoPostal>? = ArrayList()
    var plpCliente: Long = 0
    var plpNu: Long = 0
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "unsignedShort")
    var plpXml: List<Int>? = ArrayList()
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "unsignedShort")
    var plpXmlRetorno: List<Int>? = ArrayList()
    @XmlSchemaType(name = "string")
    var status: StatusPlp? = null
}