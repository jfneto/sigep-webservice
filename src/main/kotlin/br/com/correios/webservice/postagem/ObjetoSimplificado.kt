package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for objetoSimplificado complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="objetoSimplificado">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="datahora_cancelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="numero_pedido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 * &lt;element name="status_pedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "objetoSimplificado",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["datahoraCancelamento", "numeroPedido", "statusPedido"]
)
class ObjetoSimplificado {

    @XmlElement(name = "datahora_cancelamento")
    var datahoraCancelamento: String? = null

    @XmlElement(name = "numero_pedido")
    var numeroPedido: Int? = null

    @XmlElement(name = "status_pedido")
    var statusPedido: String? = null

}