package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for cartaoPostagemERP complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cartaoPostagemERP">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="codigoAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="contratos" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}contratoERP" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataVigenciaFim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataVigenciaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="datajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="datajVigenciaFim" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="datajVigenciaInicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="descricaoStatusCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="descricaoUnidadePostagemGenerica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="horajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="servicos" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoERP" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="statusCartaoPostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="statusCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="unidadeGenerica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "cartaoPostagemERP",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["codigoAdministrativo", "contratos", "dataAtualizacao", "dataVigenciaFim", "dataVigenciaInicio", "datajAtualizacao", "datajVigenciaFim", "datajVigenciaInicio", "descricaoStatusCartao", "descricaoUnidadePostagemGenerica", "horajAtualizacao", "numero", "servicos", "statusCartaoPostagem", "statusCodigo", "unidadeGenerica", "unidadesPostagem"]
)
class CartaoPostagemERP {

    var codigoAdministrativo: String? = null

    @XmlElement(nillable = true)
    var contratos: List<ContratoERP>? = ArrayList()

    @XmlSchemaType(name = "dateTime")
    var dataAtualizacao: XMLGregorianCalendar? = null

    @XmlSchemaType(name = "dateTime")
    var dataVigenciaFim: XMLGregorianCalendar? = null

    @XmlSchemaType(name = "dateTime")
    var dataVigenciaInicio: XMLGregorianCalendar? = null

    var datajAtualizacao: Int? = null

    var datajVigenciaFim: Int? = null

    var datajVigenciaInicio: Int? = null

    var descricaoStatusCartao: String? = null

    var descricaoUnidadePostagemGenerica: String? = null

    var horajAtualizacao: Int? = null

    var numero: String? = null

    @XmlElement(nillable = true)
    var servicos: List<ServicoERP>? = ArrayList()

    var statusCartaoPostagem: String? = null

    var statusCodigo: String? = null

    var unidadeGenerica: String? = null

    @XmlElement(nillable = true)
    var unidadesPostagem: List<UnidadePostagemERP>? = ArrayList()

}