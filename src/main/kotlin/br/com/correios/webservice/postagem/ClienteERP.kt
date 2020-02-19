package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for clienteERP complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="clienteERP">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="contratos" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}contratoERP" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="datajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="descricaoStatusCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="gerenteConta" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}gerenteConta" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="horajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="inscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="statusCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "clienteERP",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["cnpj", "contratos", "dataAtualizacao", "datajAtualizacao", "descricaoStatusCliente", "gerenteConta", "horajAtualizacao", "id", "inscricaoEstadual", "nome", "statusCodigo"]
)
class ClienteERP {

    var cnpj: String? = null

    @XmlElement(nillable = true)
    var contratos: List<ContratoERP>? = ArrayList()

    @XmlSchemaType(name = "dateTime")
    var dataAtualizacao: XMLGregorianCalendar? = null

    var datajAtualizacao: Int? = null

    var descricaoStatusCliente: String? = null

    @XmlElement(nillable = true)
    var gerenteConta: List<GerenteConta>? = ArrayList()

    var horajAtualizacao: Long? = null

    var id: Long = 0

    var inscricaoEstadual: String? = null

    var nome: String? = null

    var statusCodigo: String? = null

}