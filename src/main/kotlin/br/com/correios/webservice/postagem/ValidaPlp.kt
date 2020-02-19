package br.com.correios.webservice.postagem

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlType

/**
 *
 * Java class for validaPlp complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="validaPlp">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="diretoria" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;element name="cartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="unidadePostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 * &lt;element name="servicosAdicionais" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "validaPlp",
    namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/",
    propOrder = ["cliente", "numero", "diretoria", "cartao", "unidadePostagem", "servico", "servicosAdicionais", "usuario", "senha"]
)
class ValidaPlp {

    var cliente: Long = 0

    var numero: String? = null

    var diretoria: Long = 0

    var cartao: String? = null

    var unidadePostagem: String? = null

    var servico: Long? = null

    var servicosAdicionais: List<String>? = ArrayList()

    var usuario: String? = null

    var senha: String? = null

}