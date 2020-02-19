package br.com.correios.webservice.rastreio

import java.util.*
import javax.xml.bind.annotation.*
import javax.xml.datatype.XMLGregorianCalendar

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaEntregaExterna", propOrder = ["carteiro", "data", "distrito", "estacao", "id", "loec", "nomeCarteiro", "nomeUnidade", "objetos", "unidade"])
class ListaEntregaExterna2 {

    var carteiro: String? = null

    @XmlSchemaType(name = "dateTime")
    var data: XMLGregorianCalendar? = null

    var distrito: String? = null

    var estacao: String? = null

    var id: String? = null

    var loec: String? = null

    var nomeCarteiro: String? = null

    var nomeUnidade: String? = null

    @XmlElement(nillable = true)
    var objetos: List<ObjetoPostal>? = ArrayList()

    var unidade: String? = null

}