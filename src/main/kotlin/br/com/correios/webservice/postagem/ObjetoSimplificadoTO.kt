package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoSimplificadoTO", propOrder = ["datahoraCancelamento", "numeroPedido", "statusPedido"])
class ObjetoSimplificadoTO {
    @XmlElement(name = "datahora_cancelamento")
    var datahoraCancelamento: String? = null
    @XmlElement(name = "numero_pedido")
    var numeroPedido: Int? = null
    @XmlElement(name = "status_pedido")
    var statusPedido: String? = null
}