package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.TipoEmbalagem
import javax.xml.bind.annotation.*

/**
 *
 * Java class for pesquisarEmbalagensPorServicoResponse complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="pesquisarEmbalagensPorServicoResponse">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="return" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}tipoEmbalagem" maxOccurs="unbounded" minOccurs="0"/>
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
    name = "pesquisarEmbalagensPorServicoResponse",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["retorno"]
)
class PesquisarEmbalagensPorServicoResponse {
    @XmlElement(name = "return")
    @XmlSchemaType(name = "string")
    var retorno: List<TipoEmbalagem>? = ArrayList()
}