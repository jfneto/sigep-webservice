package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.StatusUsuario
import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for usuarioInstalacao complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="usuarioInstalacao">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="dataSenha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 * &lt;element name="gerenteMaster" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}gerenteConta" minOccurs="0"/>
 * &lt;element name="hashSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="parametros" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}parametroMaster" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="status" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusUsuario" minOccurs="0"/>
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
    name = "usuarioInstalacao",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["dataAtualizacao", "dataInclusao", "dataSenha", "gerenteMaster", "hashSenha", "id", "login", "nome", "parametros", "senha", "status", "validade"]
)
class UsuarioInstalacao {

    @XmlSchemaType(name = "dateTime")
    var dataAtualizacao: XMLGregorianCalendar? = null

    @XmlSchemaType(name = "dateTime")
    var dataInclusao: XMLGregorianCalendar? = null

    @XmlSchemaType(name = "dateTime")
    var dataSenha: XMLGregorianCalendar? = null

    var gerenteMaster: GerenteConta? = null

    var hashSenha: String? = null

    var id: Long? = null

    var login: String? = null

    var nome: String? = null

    @XmlElement(nillable = true)
    var parametros: List<ParametroMaster>? = ArrayList()

    var senha: String? = null

    @XmlSchemaType(name = "string")
    var status: StatusUsuario? = null

    var validade: String? = null

}