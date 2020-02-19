package br.com.correios.webservice.postagem

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for retornoCancelamento complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="retornoCancelamento">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="cod_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="codigo_administrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="msg_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="objeto_postal" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoSimplificado" minOccurs="0"/>
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
    name = "retornoCancelamento",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["codErro", "codigoAdministrativo", "data", "hora", "msgErro", "objetoPostal"]
)
class RetornoCancelamento {

    @XmlElement(name = "cod_erro")
    var codErro: String? = null

    @XmlElement(name = "codigo_administrativo")
    var codigoAdministrativo: String? = null
    var data: String? = null
    var hora: String? = null
    @XmlElement(name = "msg_erro")
    var msgErro: String? = null
    @XmlElement(name = "objeto_postal")
    var objetoPostal: ObjetoSimplificado? = null

}