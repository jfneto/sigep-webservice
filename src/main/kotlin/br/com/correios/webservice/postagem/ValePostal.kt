package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlSchemaType
import javax.xml.bind.annotation.XmlType
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for valePostal complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="valePostal">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="cidNoCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="ctcCoAadministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="ctcNuContrato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="ctcNuContratoEct" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="cvpEdBairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cvpEdCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cvpEdComplemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cvpEdNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cvpNoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cvpNuCep" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="descricaoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="estSgEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="monVarTarifaAdicional" type="{http://www.w3.org/2001/XMLSchema}int"/>
 * &lt;element name="monVarTarifaServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
 * &lt;element name="monVarValorDescontos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 * &lt;element name="monVarValorImposto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 * &lt;element name="prsCoProdutoServico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="pveNu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="pveOrgNuAgencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="pveOrgNuAgenciaDes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="pveOrgNuAgenciaOri" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="retornaCodErro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 * &lt;element name="sitNoSituacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="tlgTxDescricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="vapDhTransacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="vapNuEtiquetaEncomenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="vapVrCobradoEct" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 * &lt;element name="vapVrNominal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    name = "valePostal",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["cidNoCidade", "ctcCoAadministrativo", "ctcNuContrato", "ctcNuContratoEct", "cvpEdBairro", "cvpEdCliente", "cvpEdComplemento", "cvpEdNumero", "cvpNoCliente", "cvpNuCep", "descricaoErro", "estSgEstado", "monVarTarifaAdicional", "monVarTarifaServico", "monVarValorDescontos", "monVarValorImposto", "prsCoProdutoServico", "pveNu", "pveOrgNuAgencia", "pveOrgNuAgenciaDes", "pveOrgNuAgenciaOri", "retornaCodErro", "sitNoSituacao", "tlgTxDescricao", "vapDhTransacao", "vapNuEtiquetaEncomenda", "vapVrCobradoEct", "vapVrNominal"]
)
class ValePostal {

    var cidNoCidade: String? = null

    var ctcCoAadministrativo: String? = null

    var ctcNuContrato: Long? = null

    var ctcNuContratoEct: Long? = null

    var cvpEdBairro: String? = null

    var cvpEdCliente: String? = null

    var cvpEdComplemento: String? = null

    var cvpEdNumero: String? = null

    var cvpNoCliente: String? = null

    var cvpNuCep: Long? = null

    var descricaoErro: String? = null

    var estSgEstado: String? = null

    var monVarTarifaAdicional = 0

    var monVarTarifaServico = 0

    var monVarValorDescontos = 0

    var monVarValorImposto = 0

    var prsCoProdutoServico: Long? = null

    var pveNu: Long? = null

    var pveOrgNuAgencia: Long? = null

    var pveOrgNuAgenciaDes: Long? = null

    var pveOrgNuAgenciaOri: Long? = null

    var retornaCodErro = 0

    var sitNoSituacao: String? = null

    var tlgTxDescricao: String? = null

    @XmlSchemaType(name = "dateTime")
    var vapDhTransacao: XMLGregorianCalendar? = null

    var vapNuEtiquetaEncomenda: String? = null

    var vapVrCobradoEct: Double? = null

    var vapVrNominal: Double? = null

}