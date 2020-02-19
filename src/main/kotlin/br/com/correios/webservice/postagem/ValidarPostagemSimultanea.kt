package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for validarPostagemSimultanea complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="validarPostagemSimultanea">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="codigoServico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="idCartaoPostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cepDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="coleta" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}coletaSimultanea" minOccurs="0"/>
 * &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "validarPostagemSimultanea",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["codAdministrativo", "codigoServico", "idCartaoPostagem", "cepDestinatario", "coleta", "usuario", "senha"]
)
class ValidarPostagemSimultanea {

    var codAdministrativo: Int? = null

    var codigoServico: Int? = null

    var idCartaoPostagem: String? = null

    var cepDestinatario: String? = null

    var coleta: ColetaSimultanea? = null

    var usuario: String? = null

    var senha: String? = null

}