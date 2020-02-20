package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.SimNao
import br.com.correios.webservice.enums.StatusObjetoPostal
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlSchemaType
import javax.xml.bind.annotation.XmlType
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for objetoPostal complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="objetoPostal">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="codigoEtiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="dataAtualizacaoCliente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataBloqueioObjeto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataCancelamentoEtiqueta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="objetoPostalPK" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoPostalPK" minOccurs="0"/>
 * &lt;element name="plpNu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="preListaPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}preListaPostagem" minOccurs="0"/>
 * &lt;element name="restricaoAerea" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}simNao" minOccurs="0"/>
 * &lt;element name="statusBloqueio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="statusEtiqueta" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusObjetoPostal" minOccurs="0"/>
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
    name = "objetoPostal",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["codigoEtiqueta", "dataAtualizacaoCliente", "dataBloqueioObjeto", "dataCancelamentoEtiqueta", "dataInclusao", "objetoPostalPK", "plpNu", "preListaPostagem", "restricaoAerea", "statusBloqueio", "statusEtiqueta"]
)
class ObjetoPostal {
    var codigoEtiqueta: String? = null
    @XmlSchemaType(name = "dateTime")
    var dataAtualizacaoCliente: XMLGregorianCalendar? = null
    @XmlSchemaType(name = "dateTime")
    var dataBloqueioObjeto: XMLGregorianCalendar? = null
    @XmlSchemaType(name = "dateTime")
    var dataCancelamentoEtiqueta: XMLGregorianCalendar? = null
    @XmlSchemaType(name = "dateTime")
    var dataInclusao: XMLGregorianCalendar? = null
    var objetoPostalPK: ObjetoPostalPK? = null
    var plpNu: Long? = null
    var preListaPostagem: PreListaPostagem? = null
    @XmlSchemaType(name = "string")
    var restricaoAerea: SimNao? = null
    var statusBloqueio: String? = null
    @XmlSchemaType(name = "string")
    var statusEtiqueta: StatusObjetoPostal? = null
}