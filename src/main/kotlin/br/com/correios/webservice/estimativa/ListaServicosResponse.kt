package br.com.correios.webservice.estimativa

import javax.xml.bind.annotation.*

/**
 *
 * Java class for anonymous complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="ListaServicosResult" type="{http://tempuri.org/}cResultadoServicos"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = ["listaServicosResult"])
@XmlRootElement(name = "ListaServicosResponse", namespace = "http://tempuri.org/")
class ListaServicosResponse {

    @XmlElement(
        name = "ListaServicosResult",
        namespace = "http://tempuri.org/",
        required = true
    )
    var listaServicosResult: CResultadoServicos? = null

}