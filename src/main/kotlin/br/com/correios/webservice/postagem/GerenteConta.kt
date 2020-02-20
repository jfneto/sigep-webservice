package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.StatusGerente
import br.com.correios.webservice.enums.TipoGerente
import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for gerenteConta complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="gerenteConta">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="clientesVisiveis" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}clienteERP" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataSenha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="status" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusGerente" minOccurs="0"/>
 * &lt;element name="tipoGerente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}tipoGerente" minOccurs="0"/>
 * &lt;element name="usuariosInstalacao" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}usuarioInstalacao" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="validade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "gerenteConta",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["clientesVisiveis", "dataAtualizacao", "dataInclusao", "dataSenha", "login", "matricula", "senha", "status", "tipoGerente", "usuariosInstalacao", "validade"]
)
class GerenteConta {
    @XmlElement(nillable = true)
    var clientesVisiveis: List<ClienteERP>? = ArrayList()
    @XmlSchemaType(name = "dateTime")
    var dataAtualizacao: XMLGregorianCalendar? = null
    @XmlSchemaType(name = "dateTime")
    var dataInclusao: XMLGregorianCalendar? = null
    @XmlSchemaType(name = "dateTime")
    var dataSenha: XMLGregorianCalendar? = null
    var login: String? = null
    var matricula: String? = null
    var senha: String? = null
    @XmlSchemaType(name = "string")
    var status: StatusGerente? = null
    @XmlSchemaType(name = "string")
    var tipoGerente: TipoGerente? = null
    @XmlElement(nillable = true)
    var usuariosInstalacao: List<UsuarioInstalacao>? = ArrayList()
    var validade: String? = null
}