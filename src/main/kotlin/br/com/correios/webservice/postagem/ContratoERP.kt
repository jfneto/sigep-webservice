package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for contratoERP complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="contratoERP">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="cartoesPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}cartaoPostagemERP" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="cliente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}clienteERP" minOccurs="0"/>
 * &lt;element name="codigoCliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="codigoDiretoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="contratoPK" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}contratoERPPK" minOccurs="0"/>
 * &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataAtualizacaoDDMMYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="dataVigenciaFim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataVigenciaFimDDMMYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="dataVigenciaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataVigenciaInicioDDMMYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="datajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="datajVigenciaFim" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="datajVigenciaInicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="descricaoDiretoriaRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="descricaoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="diretoriaRegional" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}unidadePostagemERP" minOccurs="0"/>
 * &lt;element name="horajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    name = "contratoERP",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["cartoesPostagem", "cliente", "codigoCliente", "codigoDiretoria", "contratoPK", "dataAtualizacao", "dataAtualizacaoDDMMYYYY", "dataVigenciaFim", "dataVigenciaFimDDMMYYYY", "dataVigenciaInicio", "dataVigenciaInicioDDMMYYYY", "datajAtualizacao", "datajVigenciaFim", "datajVigenciaInicio", "descricaoDiretoriaRegional", "descricaoStatus", "diretoriaRegional", "horajAtualizacao", "statusCodigo"]
)
class ContratoERP {
    @XmlElement(nillable = true)
    var cartoesPostagem: List<CartaoPostagemERP>? = ArrayList()

    var cliente: ClienteERP? = null

    var codigoCliente: Long = 0

    var codigoDiretoria: String? = null

    var contratoPK: ContratoERPPK? = null

    @XmlSchemaType(name = "dateTime")
    var dataAtualizacao: XMLGregorianCalendar? = null

    var dataAtualizacaoDDMMYYYY: String? = null

    @XmlSchemaType(name = "dateTime")
    var dataVigenciaFim: XMLGregorianCalendar? = null

    var dataVigenciaFimDDMMYYYY: String? = null

    @XmlSchemaType(name = "dateTime")
    var dataVigenciaInicio: XMLGregorianCalendar? = null

    var dataVigenciaInicioDDMMYYYY: String? = null

    var datajAtualizacao: Int? = null

    var datajVigenciaFim: Int? = null

    var datajVigenciaInicio: Int? = null

    var descricaoDiretoriaRegional: String? = null

    var descricaoStatus: String? = null

    var diretoriaRegional: UnidadePostagemERP? = null

    var horajAtualizacao: Int? = null

    var statusCodigo: String? = null

}