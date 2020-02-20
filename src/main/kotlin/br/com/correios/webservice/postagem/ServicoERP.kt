package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for servicoERP complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="servicoERP">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="datajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="horajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="servicoSigep" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoSigep" minOccurs="0"/>
 * &lt;element name="servicosAdicionais" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoAdicionalERP" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="tipo1Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="tipo1Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="tipo2Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="tipo2Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="vigencia" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}vigenciaERP" minOccurs="0"/>
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
    name = "servicoERP",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["codigo", "dataAtualizacao", "datajAtualizacao", "descricao", "horajAtualizacao", "id", "servicoSigep", "servicosAdicionais", "tipo1Codigo", "tipo1Descricao", "tipo2Codigo", "tipo2Descricao", "vigencia"]
)
class ServicoERP {
    var codigo: String? = null
    @XmlSchemaType(name = "dateTime")
    var dataAtualizacao: XMLGregorianCalendar? = null
    var datajAtualizacao: Int? = null
    var descricao: String? = null
    var horajAtualizacao: Int? = null
    var id: Long = 0
    var servicoSigep: ServicoSigep? = null
    @XmlElement(nillable = true)
    var servicosAdicionais: List<ServicoAdicionalERP>? = ArrayList()
    var tipo1Codigo: String? = null
    var tipo1Descricao: String? = null
    var tipo2Codigo: String? = null
    var tipo2Descricao: String? = null
    var vigencia: VigenciaERP? = null
}