package br.com.correios.webservice.rastreio

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for eventos complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="eventos">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="detalhe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="recebedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="sto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="amazoncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="amazontimezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element ref="{http://resource.webservice.correios.com.br/}destino" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element ref="{http://resource.webservice.correios.com.br/}endereco" minOccurs="0"/>
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
    name = "eventos",
    namespace = "http://resource.webservice.correios.com.br/",
    propOrder = ["tipo", "status", "data", "hora", "descricao", "detalhe", "recebedor", "documento", "comentario", "local", "codigo", "cidade", "uf", "sto", "amazoncode", "amazontimezone", "destino", "endereco"]
)
class Eventos {
    var tipo: String? = null
    var status: String? = null
    var data: String? = null
    var hora: String? = null
    var descricao: String? = null
    var detalhe: String? = null
    var recebedor: String? = null
    var documento: String? = null
    var comentario: String? = null
    var local: String? = null
    var codigo: String? = null
    var cidade: String? = null
    var uf: String? = null
    var sto: String? = null
    var amazoncode: String? = null
    var amazontimezone: String? = null

    @XmlElement(namespace = "http://resource.webservice.correios.com.br/")
    var destino: MutableList<Destinos>? = ArrayList()

    @XmlElement(namespace = "http://resource.webservice.correios.com.br/")
    var endereco: EnderecoMobile? = null
}