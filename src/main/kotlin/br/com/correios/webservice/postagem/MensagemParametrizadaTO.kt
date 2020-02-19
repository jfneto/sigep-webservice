package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.TipoMensagem
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlSchemaType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for mensagemParametrizadaTO complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="mensagemParametrizadaTO">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="tipo" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}tipoMensagem" minOccurs="0"/>
 * &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "mensagemParametrizadaTO",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["mensagem", "tipo", "titulo"]
)
class MensagemParametrizadaTO {

    var mensagem: String? = null

    @XmlSchemaType(name = "string")
    var tipo: TipoMensagem? = null
    var titulo: String? = null

}