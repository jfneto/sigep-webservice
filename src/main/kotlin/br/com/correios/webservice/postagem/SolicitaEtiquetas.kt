package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for solicitaEtiquetas complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="solicitaEtiquetas">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="tipoDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="idServico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="qtdEtiquetas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    name = "solicitaEtiquetas",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["tipoDestinatario", "identificador", "idServico", "qtdEtiquetas", "usuario", "senha"]
)
class SolicitaEtiquetas {
    var tipoDestinatario: String? = null
    var identificador: String? = null
    var idServico: Long? = null
    var qtdEtiquetas: Int? = null
    var usuario: String? = null
    var senha: String? = null
}