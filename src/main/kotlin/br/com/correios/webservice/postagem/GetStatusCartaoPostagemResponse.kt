package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.StatusCartao
import javax.xml.bind.annotation.*

/**
 *
 * Java class for getStatusCartaoPostagemResponse complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getStatusCartaoPostagemResponse">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="return" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusCartao" minOccurs="0"/>
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
    name = "getStatusCartaoPostagemResponse",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["retorno"]
)
class GetStatusCartaoPostagemResponse {
    @XmlElement(name = "return")
    @XmlSchemaType(name = "string")
    var retorno: StatusCartao? = null
}