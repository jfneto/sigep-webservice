package br.com.correios.webservice.postagem

import br.com.correios.webservice.enums.CategoriaServico
import br.com.correios.webservice.enums.SimNao
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlSchemaType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for servicoSigep complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="servicoSigep">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="categoriaServico" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}categoriaServico" minOccurs="0"/>
 * &lt;element name="chancela" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}chancelaMaster" minOccurs="0"/>
 * &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="exigeDimensoes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 * &lt;element name="exigeValorCobrar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 * &lt;element name="imitm" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="pagamentoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="remessaAgrupada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="restricao" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}simNao" minOccurs="0"/>
 * &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="servicoERP" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoERP" minOccurs="0"/>
 * &lt;element name="ssiCoCodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "servicoSigep",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["categoriaServico", "chancela", "descricao", "exigeDimensoes", "exigeValorCobrar", "imitm", "pagamentoEntrega", "remessaAgrupada", "restricao", "servico", "servicoERP", "ssiCoCodigoPostal"]
)
class ServicoSigep {
    @XmlSchemaType(name = "string")
    var categoriaServico: CategoriaServico? = null
    var chancela: ChancelaMaster? = null
    var descricao: String? = null
    var isExigeDimensoes: Boolean? = null
    var isExigeValorCobrar: Boolean? = null
    var imitm: Long = 0
    var pagamentoEntrega: String? = null
    var remessaAgrupada: String? = null
    @XmlSchemaType(name = "string")
    var restricao: SimNao? = null
    var servico: Long = 0
    var servicoERP: ServicoERP? = null
    var ssiCoCodigoPostal: String? = null
}